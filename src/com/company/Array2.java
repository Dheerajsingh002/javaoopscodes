package com.company;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] arr=new int[n][m];
        int k=0;
        for (int i=1;i<n;i++){
            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j]);
                arr[i][j] = k;
//                k++;
            }
}           for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
//                }
         }
            System.out.println();

    }
}
}