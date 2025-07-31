package com.isaejoao.organizador_doces.controller;

import com.isaejoao.organizador_doces.OrganizadorDocesApplication;
import com.isaejoao.organizador_doces.email.JavaMailApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PrimeiroController {

   /*Enviar dados para pagina 
   
   @GetMapping({"/", "/index", "/index.html"})
    public String index(Model model) {

        JavaMailApp javaMailApp = new JavaMailApp();

        model.addAttribute("remetente", javaMailApp.dotenv.get("EMAIL"));
        model.addAttribute("email", OrganizadorDocesApplication.email.getDestinatario());
        model.addAttribute("assunto", OrganizadorDocesApplication.email.getAssunto());
        model.addAttribute("mensagem", OrganizadorDocesApplication.email.getMensagem());
        return "index";
    }*/

    //pegar dados da página
    @PostMapping("/enviar")
    public String processarFormulario(
            @RequestParam("assunto") String assunto,
            @RequestParam("mensagem") String mensagem,
            @RequestParam("destinatario") String destinatario) {

        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Destinatario: " + destinatario);
        
        return "index";
    }
}
