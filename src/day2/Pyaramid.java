//Input: 4
//
//        Output:
//           *
//          ***
//         *****
//        *******


package day2;

import java.util.Scanner;

public class Pyaramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();sc.close();
        for (int i=0;i<a;i++){
            for (int j=a;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
