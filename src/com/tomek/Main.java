package com.tomek;

public class Main {



    public static int euklides(int a, int b) {
        while (b != 0) {
            int nwd = a % b;
            a = b;
            b = nwd;
        }
        return a;
    }

    public static void main(String[] args) {

        int a = 21;
        int b = 56;

        int NWD = Main.euklides(a,b);

        System.out.println("NWD liczb: " + a + " i " + b + " to: " + NWD);


    }
}
