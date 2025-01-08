package com.joao.agenda.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class TesteController /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        SpringApplication.run(TesteController.class, args);
    }

//    @Override
//    public void run(String... args) {
//        String url = "http://localhost:8080";
//
//        if (Desktop.isDesktopSupported()) {
//            try {
//                Desktop desktop = Desktop.getDesktop();
//                desktop.browse(new URI(url));
//                System.out.println("Navegador aberto com sucesso!");
//            } catch (Exception e) {
//                System.err.println("Erro ao abrir o navegador: " + e.getMessage());
//            }
//        } else {
//            System.err.println("A funcionalidade Desktop não é suportada neste sistema.");
//        }
//    }

    @GetMapping({"/", "home", "home.html"})
    public String home() {

        return "home";
    }


}
