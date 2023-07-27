import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double p = in.nextDouble();
        double t= in.nextDouble();
        double r= in.nextDouble();

       double SI=(p*t*r)/100;

        System.out.println("simple Interest = "+ SI);


    }
}
