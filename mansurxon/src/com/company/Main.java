package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kirit  = new Scanner(System.in);
        int a,b;
        a=kirit.nextInt();
        b=(a%10)*100 + ((a/10)%10)*10 + a/100;
        System.out.println(b);
    }
}
