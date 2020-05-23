package com.company;

public class Guess3 {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Estoy pensando una letra de la A la Z\n ");
        System.out.print("Puedes adivinarla? :");

        ch = (char) System.in.read();
        if (ch == answer) System.out.println("***CORRECTO");
        else {
            System.out.print("... Lo siento....");

            if (ch < answer) System.out.println("muy abajo");
            else System.out.println("muy arriba");
        }

    }
}
