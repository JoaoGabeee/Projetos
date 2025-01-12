package com.joao.agenda.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@SpringBootApplication
@Controller
public class TesteController {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(TesteController.class, args);

        String url = "http://localhost:8080";

        Runtime runTime = Runtime.getRuntime();
        runTime.exec(new String[]{"powershell.exe", "-Command", "Start-process", url});
    }

    @GetMapping({"/", "home", "home.html"})
    public String home() {

        return "home";
    }

}
