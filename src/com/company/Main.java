package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int x = in.nextInt();
        int j = -1;
        for (int i = 0; i < n; i++){
            if (a[i] == x) {
                j = i + 1;
                break;
            }
        if (j == -1){
            System.out.println("No");
        }
        else {
            System.out.println("j");
        }
        }
    }
}
