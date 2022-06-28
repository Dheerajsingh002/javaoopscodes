package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = arr;
        arr2[0] = 10;
        System.out.println(arr2[0]);
        System.out.println(arr[0]);
    }
}
