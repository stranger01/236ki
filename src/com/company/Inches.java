package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Inches {
    public static void main(String[] args) {

        long ci;
        String nombre = "10.1";
        Integer numbero = 0;
        Double num2 = Double.valueOf(nombre);
        Integer num3 = null;
        ArrayList<String> listaCadenas = new ArrayList<String>();
        // ["hola", "mundo"]
        listaCadenas.add("Hola");
        listaCadenas.add("mundo");

        long im;

        /**
         * int, long
         * top psvm
         *for each, loop
         */

        im = 5280 *12;
        ci = im * im * im;

        System.out.println("There are  " + ci + " cubic inches in cubic mile");
        System.out.println(listaCadenas);
    }
}
