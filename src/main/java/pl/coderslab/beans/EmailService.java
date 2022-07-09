package pl.coderslab.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class EmailService implements MessageService {

    public EmailService(MessageSender messageSender) {

    }

    @Override
    public void send() {
        System.out.println("Sending email");

    }

    @Override
    public void send(String message) {
        System.out.println(message);

    }

}
