package pl.coderslab.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor

public class HelloWorld {

    String message;

    public HelloWorld() {

    }


    public void printMessage() {
        System.out.println("Your Message : " + message);
    }


}
