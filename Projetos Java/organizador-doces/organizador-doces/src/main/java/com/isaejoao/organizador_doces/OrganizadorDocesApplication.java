package com.isaejoao.organizador_doces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@SpringBootApplication
public class OrganizadorDocesApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(OrganizadorDocesApplication.class, args);

		String url = "http://localhost:8080";

		Runtime runTime = Runtime.getRuntime();
		runTime.exec(new String[]{"powershell.exe", "-Command", "Start-process", url});

	}

	@GetMapping({"/", "/index", "/index.html"})
	public String index() {

		return "index";
	}
}



