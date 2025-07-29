package com.isaejoao.organizador_doces;

import com.isaejoao.organizador_doces.email.Email;
import com.isaejoao.organizador_doces.email.JavaMailApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class OrganizadorDocesApplication {

	public static Email email = new Email();

	public static void main(String[] args) throws IOException {
		SpringApplication.run(OrganizadorDocesApplication.class, args);


		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o email do destinatario: ");
		email.setDestinatario(scanner.nextLine());

		System.out.println("Digite o assunto do email: ");
		email.setAssunto(scanner.nextLine());

		System.out.println("Digite a mensagem do email: ");
		email.setMensagem(scanner.nextLine());

		JavaMailApp enviarEmail = new JavaMailApp();
		enviarEmail.enviarEmail();

		//abrirNavegador();

	}

	public static void abrirNavegador() throws IOException {
		String url = "http://localhost:8080";

		Runtime runTime = Runtime.getRuntime();
		runTime.exec(new String[]{"powershell.exe", "-Command", "Start-process", url});

		/*
		String url = "http://localhost:8080";
		String os = System.getProperty("os.name").toLowerCase();

		if (os.contains("win")) {
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
		} else if (os.contains("mac")) {
    		Runtime.getRuntime().exec("open " + url);
		} else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
 		   Runtime.getRuntime().exec("xdg-open " + url);
		} else {
    		System.out.println("Sistema operacional não suportado para abrir navegador automaticamente.");
		}
		*/
	}

}



