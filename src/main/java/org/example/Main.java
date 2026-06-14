package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EncoderDecoder ed = new EncoderDecoder('B');

        String plainText = ed.encoder("HELLO WORLD");
        System.out.println("Encoded text is : " + plainText);

        String encodedText = ed.decoder(plainText);
        System.out.println("Decoded text is : " + encodedText);
    }
}