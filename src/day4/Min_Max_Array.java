package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Min_Max_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array:");
        int a = sc.nextInt();sc.nextLine();
        ArrayList<Integer> arr1= new ArrayList<>();
        for (int i=0;i<a;i++){
            System.out.print("Enter the Number "+(i+1) + ":");
            int b = sc.nextInt();sc.nextLine();
            arr1.add(b);
        }

        int max = arr1.get(0);
        int min = arr1.get(0);
        for (int i : arr1){
            if(i > max) {
                max = i;
            }
            if (i < min){
                min = i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
