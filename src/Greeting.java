import java.util.Scanner;

//Take name as input and print a greeting message for that particular name
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your Name here : ");
        String Name = in.next();
        System.out.println("Hey "+Name+", How are you ?");
    }
}
