package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List numbersList = new ArrayList<>(10);
        System.out.println("Enter numbers in array:");
        int n = sc.nextInt();
        numbersList.add(n);
        for (int i = 2; i < 10; i++) {
            numbersList.add(i - 1 + i - 2);
        }
        System.out.println(numbersList);
    }
}
