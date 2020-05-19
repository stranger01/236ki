package com.company;

public class RelLogsOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;
        String uno = "a";

        i = 10;
        j = 11;
        if (i < j) System.out.println("i  less than j");
        if (i <= j) System.out.println("i less or equal");
        if (i != j) System.out.println("i is not equal to j");
        if (i == j) System.out.println("i is equal to j");
        if (i >= j) System.out.println("i is greather or equal to j");
        if (i > j) System.out.println("i is greather than j");

        b1 = true;
        b2 = false;

        if (b1 & b2) System.out.println("this wont execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if (b1 | b2) System.out.println("b1 | b2 is true");



    }

}
