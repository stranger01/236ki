package com.company;

public class Guess {
    public static void main(String[] args)
    throws java.io.IOException{
        char ch, answer = 'K';

        System.out.println("Im thinking of a letter between A an Z ");
        System.out.print("Puedes adivinar?    ");

        ch = (char) System.in.read();
        if (ch == answer) System.out.print("***CORRECTO");

    }
}
