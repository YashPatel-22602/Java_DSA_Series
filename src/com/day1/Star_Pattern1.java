/**
**
***  */

package com.day1;

import java.util.Scanner;

public class Star_Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows you want to display: ");
        int a = sc.nextInt();
        for (int i=0;i<a;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
