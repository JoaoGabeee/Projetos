package com.isaejoao.organizador_doces.controller;

import com.isaejoao.organizador_doces.OrganizadorDocesApplication;
import com.isaejoao.organizador_doces.email.JavaMailApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrimeiroController {

    @GetMapping({"/", "/index", "/index.html"})
    public String index(Model model) {

        JavaMailApp javaMailApp = new JavaMailApp();

        model.addAttribute("remetente", javaMailApp.dotenv.get("EMAIL"));
        model.addAttribute("destinatario", OrganizadorDocesApplication.email.getDestinatario());
        model.addAttribute("assunto", OrganizadorDocesApplication.email.getAssunto());
        model.addAttribute("mensagem", OrganizadorDocesApplication.email.getMensagem());
        return "index";
    }
}
