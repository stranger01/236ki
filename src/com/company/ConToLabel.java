package com.company;

public class ConToLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.println("\nOuter loop class" + i + ", Inner loop");

            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerloop;
                System.out.println(j);

            }

        }

    }
}
