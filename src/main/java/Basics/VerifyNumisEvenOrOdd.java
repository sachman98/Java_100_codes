package Basics;

import java.util.Scanner;

public class VerifyNumisEvenOrOdd {

    public static void main(String arg[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to be verified : ");
        int num=scanner.nextInt();
        if (num%2==0){
            System.out.println("The number is even :"+num);
        }else {
            System.out.println("The number is odd :"+num);
        }

    }
}
