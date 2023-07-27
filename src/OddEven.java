//Write a program to print whether a number is even or odd, also take input from the user

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter any Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num%2==0){
            System.out.println(num+" is a even Number");
        }
        else{
            System.out.println(num+" is a odd Number");
        }

    }
}