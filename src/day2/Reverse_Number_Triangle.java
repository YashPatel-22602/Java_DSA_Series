//Input: 5
//
//        Output:
//        12345
//        1234
//        123
//        12
//        1



        package day2;
import java.util.Scanner;

public class Reverse_Number_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a  = sc.nextInt();sc.close();
        for (int i=a;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
