package com.isaejoao.organizador_doces.controller;

import com.isaejoao.organizador_doces.OrganizadorDocesApplication;
import com.isaejoao.organizador_doces.email.Email;
import com.isaejoao.organizador_doces.email.JavaMailApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PrimeiroController {

    public static Email email = new Email();
    private final JavaMailApp javaMailApp = new JavaMailApp();

   /*Enviar dados para pagina */
   
   @GetMapping({"/", "/index", "/index.html"})
    public String index(Model model) {

        model.addAttribute("remetente", JavaMailApp.dotenv.get("EMAIL"));
        model.addAttribute("email", OrganizadorDocesApplication.email.getDestinatario());
        model.addAttribute("assunto", OrganizadorDocesApplication.email.getAssunto());
        model.addAttribute("mensagem", OrganizadorDocesApplication.email.getMensagem());
        return "index";
    }

    //pegar dados da página
    @PostMapping("/enviar")
    public String processarFormulario(
            @RequestParam("assunto") String assunto,
            @RequestParam("mensagem") String mensagem,
            @RequestParam("destinatario") String destinatario) {

        email.setAssunto(assunto);
        email.setMensagem(mensagem);
        email.setDestinatario(destinatario);

        javaMailApp.enviarEmail();
        
        return "index";
    }
}
