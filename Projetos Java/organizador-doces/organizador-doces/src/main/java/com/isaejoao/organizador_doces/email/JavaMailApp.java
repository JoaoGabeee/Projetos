package com.isaejoao.organizador_doces.email;

import com.isaejoao.organizador_doces.OrganizadorDocesApplication;
import com.isaejoao.organizador_doces.controller.PrimeiroController;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import io.github.cdimascio.dotenv.Dotenv;

public class JavaMailApp {

    public static Dotenv dotenv = Dotenv.configure().directory("./organizador-doces").load();

    public void enviarEmail() {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(dotenv.get("EMAIL"),
                                dotenv.get("SENHA"));
                    }
                });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(dotenv.get("EMAIL")));

                Address[] toUser = InternetAddress.parse(PrimeiroController.email.getDestinatario());

                message.setRecipients(Message.RecipientType.TO, toUser);
                message.setSubject(PrimeiroController.email.getAssunto());
                message.setText(PrimeiroController.email.getMensagem());
                Transport.send(message);

            } catch (MessagingException e) {
                throw new RuntimeException(e);
        }
    }
}
