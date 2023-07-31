import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)
public class SimpCalci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = in.nextInt();
        System.out.print("Enter a number ");
        int b = in.nextInt();
        System.out.println(" Enter a operator like +,-,*,/");
        char operator = in.next().charAt(0);

        if (operator == '+') {
            System.out.println(a+b);
        }

        else if (operator == '-') {
            System.out.println(a-b);
        }
        else if (operator == '*') {
            System.out.println(a*b);
        }
        else if (operator == '/') {
            System.out.println(a/b);
        }
        else  {
            System.out.println("Error");
        }







    }
    }

