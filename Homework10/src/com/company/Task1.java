package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int startMin = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        List numbersList = new ArrayList<>();
        System.out.println("Enter numbers in array:");
       while(sc.hasNextInt()) {
           int i = sc.nextInt();
           numbersList.add(i);
           if (i < startMin && i % 3 == 0) {
               startMin = i;
           }

       }
        System.out.println("Collection: " + numbersList);
       String result = startMin == Integer.MAX_VALUE ? "No suitable number in ArrayList" : "Number is: " + startMin;
        System.out.println(result);


    }
}
