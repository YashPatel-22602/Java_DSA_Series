package day2;

import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();sc.close();
        int count = 0;
        for (int i =0;i<a;i++){
            for (int j=0;j<=i;j++){
                System.out.print(count);
                System.out.print(" ");
                count += 1;
            }
            System.out.println();
        }
    }
}
