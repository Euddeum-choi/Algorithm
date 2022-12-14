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

    public static void mergeSort(int[] arr ){
        sorted = new int[arr.length];
        mergeSort(arr,0,arr.length-1);
        sorted=null;
    }

    public static void mergeSort(int[] arr, int left, int right){
        if (left == right){
            return;
        }
        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        //왼쪽 쪼개는 재귀
        mergeSort(arr,mid+1,right);
        //오른쪽 쪼개는 재귀
        mergerSort(arr, left,mid,right);
        //합하는 -> override
    }

    public static void mergerSort(int[] arr, int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid&&r<=right){
            if(arr[l]<=arr[r]) {
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
            else{
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }

        if(l>mid){
            while(r<=right){
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }
        else{
            while(l<=mid){
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
        }

        for(int i=left;i<=right;i++){
            arr[i] = sorted[i];
        }
    }
}
