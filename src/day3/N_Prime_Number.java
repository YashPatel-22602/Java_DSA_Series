package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class N_Prime_Number {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Number till which you want Prime Number:");
        int a = sc.nextInt();sc.close();
        System.out.println(a);
        ArrayList<Integer> result = new ArrayList<>();
        boolean isPrime = true;
        if (a<2){
            System.out.println("Number should be greater than 1");
        }
        else {
            for (int i=2;i<=a;i++){
                for (int j=2;j<=(i/2); j++){
                    if (i % j == 0){
                        isPrime = false;
                    }
                    else {
                        isPrime = true;
                    }
                }
                if (isPrime == true){
                    result.add(i);
                }
            }
            System.out.println(result);
        }
    }
}
