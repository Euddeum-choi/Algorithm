package com.company;

import java.util.Scanner;

public class Main {

    static int SIZE = 10;
    static int[] arr = new int[SIZE];

    static int[] sorted;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<SIZE;i++){
            arr[i] = scanner.nextInt();
        }

        mergeSort(arr);

        for(int i=0;i<SIZE;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
