package day2;

import java.util.Scanner;

public class Triangle_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();sc.close();
        for (int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
