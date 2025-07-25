package com.isaejoao.organizador_doces.email;

import com.isaejoao.organizador_doces.OrganizadorDocesApplication;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class JavaMailApp {

    public void enviarEmail() {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication("joao2008gabe@gmail.com",
                                "icjw iygj ihsp roee");
                    }
                });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("joao2008gabe@gmail.com"));

                Address[] toUser = InternetAddress.parse(OrganizadorDocesApplication.email.getDestinatario());

                message.setRecipients(Message.RecipientType.TO, toUser);
                message.setSubject(OrganizadorDocesApplication.email.getAssunto());
                message.setText(OrganizadorDocesApplication.email.getMensagem());
                Transport.send(message);

                System.out.println("Email enviado para: " + OrganizadorDocesApplication.email.getDestinatario());
            } catch (MessagingException e) {
                throw new RuntimeException(e);
        }
    }
}
