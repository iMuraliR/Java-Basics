//To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        String str = "Radar", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength-1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println("The given string is palindrome");
        }
        else {
            System.out.println("The given string is not a palindrome");
        }

    }
}
