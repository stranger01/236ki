package com.company;


/**
 * Primitive type conversion
 * explit and implicit
 */

public class castConversion {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shotVal = 7;
        long longVal = 5;

        short result1 = (short) longVal;
        short result2 =(short) (byteVal - longVal);

        System.out.println("sucess");

    }
}
