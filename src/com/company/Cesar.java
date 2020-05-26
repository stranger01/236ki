package com.company;

public class Cesar {
   public static StringBuffer encrypt(String text, int s) {
       StringBuffer result = new StringBuffer();
       for (int i = 0; i <text.length(); i++) {

           if (Character.isUpperCase(text.charAt(i))){
               char ch = (char)(((int)text.charAt(i)  +
               s - 65) % 26 +65);
               result.append(ch);
           }
       }
       return result;
   }

    public static void main(String[] args) {
        String text = "ATTACKMODEON";
        int s = 5;

        System.out.println("Text : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Chiper : " + encrypt(text, s));
    }
}