package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng1 : ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf(" Nhập arr1["+ i + "] : ");
            arr1[i] = scanner.nextInt();

        }show(arr1);
        System.out.println("");
        System.out.printf("GTNN trong mang la: "+min(arr1));
    }
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
    public static int min(int[] arr){
        int min=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }return min;
    }
}
