package Basics;

import java.util.Scanner;

public class VerifyAgeToVote {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of the person: ");
        int num= scanner.nextInt();
        if (num<18){
            System.out.println("The person is not eligible to vote : ");
        }else {
            System.out.println("The person can vote :");
        }
    }
}

