package com.joao.email.controller;

import com.joao.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;
@Controller
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping({"/", "/index", "/index.html"})
    public String index(Model model) {

        model.addAttribute("remetente", emailService.dotenv.get("EMAIL"));

        return "index";
    }

    @PostMapping("/index")
    public String processarFormulario(Model model,
            @RequestParam("assunto") String assunto,
            @RequestParam("mensagem") String mensagem,
            @RequestParam("destinatario") String destinatario) {

        model.addAttribute("remetente", emailService.dotenv.get("EMAIL"));

        try {
            emailService.enviarEmail(assunto, mensagem, destinatario);

            model.addAttribute("mensagemSucesso", "✅ E-mail enviado com sucesso para: " + destinatario);
        } catch(Exception e) {
            model.addAttribute("mensagemErro", "❌ Não conseguimos enviar seu e-mail --- Erro: " + e);
        }

        return "index";
    }

}
