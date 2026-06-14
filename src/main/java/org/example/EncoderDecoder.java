package org.example;

public class EncoderDecoder {

    private static final  String referenceTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";

    private char offsetChar ;


    public EncoderDecoder(char offsetChar) {
        if(referenceTable.indexOf(offsetChar) == -1){
            throw new IllegalArgumentException("Character is invalid");
        }
        this.offsetChar = offsetChar;
    }

    public String encoder(String plainText){
        int offset = referenceTable.indexOf(offsetChar);
        System.out.println(offsetChar + "Offset index is : " + offset);
        StringBuilder result = new StringBuilder();
        result.append(offsetChar);

        System.out.println("Encoding " + plainText);
        for(char i : plainText.toCharArray()){
            int index = referenceTable.indexOf(i);
            System.out.println(i + " orignal index = " + index);

            if(index == -1){
                result.append(i);
                System.out.println("If index = -1, Result is : " + result);
            }else{
                int newIndex = (index - offset);
                System.out.println(i + " new index = " + newIndex);
                result.append(referenceTable.charAt(newIndex));
                System.out.println("new Result is : " + result);

            }
        }
        return result.toString();

    }

    public String decoder(String encodedText) {
        if (encodedText == null || encodedText.length() == 0) {
            System.out.println("encodedText is null ");
            return "";
        }

        char offsetChar = encodedText.charAt(0);
        int offset = referenceTable.indexOf(offsetChar);

        if (referenceTable.indexOf(offsetChar) == -1) {
            throw new IllegalArgumentException("Character is invalid");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i < encodedText.length(); i++) {
            char character = encodedText.charAt(i);
            System.out.println("character is : " + character);
            int index = referenceTable.indexOf(character);
            System.out.println(character + " Original index is : " + index);


            if (index == -1) {
                result.append(character);
                System.out.println("If index = -1, Result is : " + result);
            } else {
                int originalIndex = (index + offset);
                System.out.println(character + " New index is : " + originalIndex);

                result.append(referenceTable.charAt(originalIndex));
            }
        }
        return result.toString();

    }
}
