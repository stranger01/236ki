package com.company;

import java.awt.desktop.SystemEventListener;

public class Factor {
    boolean isFactor(int a, int b){
        if ((b % a) ==0) return true;
        else return false;
    }
}

class isFact{
    public static void main(String[] args) {
        Factor x = new Factor();
        if (x.isFactor(2,20))System.out.println("2 is factor");
        if (x.isFactor(3, 20)) System.out.println("this wont be displayed");

    }
}