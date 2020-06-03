package com.company;

public class DWdemo {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch;
        do {
            System.out.print("Press any key followed by ENTER : ");
            ch = (char) System.in.read();

        } while (ch != 'q');

    }
}
