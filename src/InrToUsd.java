import java.util.Scanner;

//Input currency in rupees and output in USD.
public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the currency amount in Rs. ");
        int inr = in.nextInt();

        float usd = inr*0.012f;

        System.out.println(usd+"$");
    }
}
