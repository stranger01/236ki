package com.company;

public class nestedIf {
    public static void main(String[] args) {
        float students = 0.0f;
        float rooms = 4.0f;

        if (students > 0.0f) {

            if (rooms > 0.0f)
                System.out.println(students / rooms);
        } else
            System.out.println("no students");

        System.out.println();
        System.out.println("**end program");

    }
}
