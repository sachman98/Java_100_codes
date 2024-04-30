package Basics;

import java.util.Scanner;

public class ConvertToPositiveNumbers {

    public static void main(String arg[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the negative numbers to be converted:");
        int number = scanner.nextInt();
        if (number<0){
            number=number*-1;
            System.out.println("The converted positive number is:"+number);
        }
    }


}
