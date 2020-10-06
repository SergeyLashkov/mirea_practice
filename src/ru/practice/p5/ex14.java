package ru.practice.p5;

import java.util.Scanner;

public class ex14 {
    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(recursion(i));
    }
}