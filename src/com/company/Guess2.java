package com.company;

public class Guess2 {
    public static void main(String[] args)
    throws java.io.IOException{
        char ch;
        char answer = 'K';

        System.out.print("Estoy pensando en una letra de la A a la Z  ");
        System.out.print("Crees poder adivinarla ? :");

        ch = (char) System.in.read();

        if (ch == answer) System.out.print("***CORRECTO***");
        else System.out.print(" Volver a intentar");

    }
}
