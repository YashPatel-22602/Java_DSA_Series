package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Size of an Array:");
        int a = sc.nextInt();sc.nextLine();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i=0;i<a;i++){
            System.out.print("Enter the Number "+(i+1) + ":");
            int b = sc.nextInt();sc.nextLine();
            arr1.add(b);
        }
        int b=0;
        int c = a-1;
        while (b<c){
            int temp = arr1.get(b);
            arr1.set(b, arr1.get(c));
            arr1.set(c,temp);
            b++;
            c--;
        }

        System.out.println(arr1);
    }
}
