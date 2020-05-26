package com.company;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 3:
                    System.out.println("is is three");
                case 4:
                    System.out.println("i is fou");
                    break;
                default:
                    System.out.println("i is five or more");

            }
    }
}
