package com.joao.projeto_email.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrimeiroController {

    @GetMapping({"/"})
    public String index() {
        return "index";
    }

}
