import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String str= sc.next();
        for (int i=str.length()-1;i >=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
