package ru.practice.p6;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во: ");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы:");
        for(int i=0;i<n;i++) {
            array[i] = in.nextInt();
        }

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int j = left - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.println("Получаем отсортированный список:");
        for (int k=0;k<n;k++){
            System.out.println(array[k]);
        }

    }
}