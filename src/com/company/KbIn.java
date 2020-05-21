package com.company;

public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;

            System.out.print("Press a key followed by Enter: ");
            ch = (char) System.in.read(); //get a char
        System.out.print("Your key is : " + ch);
        }
    }

