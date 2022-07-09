package pl.coderslab.beans;


import lombok.Data;

@Data

public class MessageSender {

    private MessageService messageService;
    private String message;

    public MessageSender(MessageService messageService) { // przekazuemy referencje z email...
        this.messageService = messageService;
    }

    public void sendMessage() {
        messageService.send();
    }

    public void sendMessageFromProperty() {
        messageService.send(message);
    }


}

