import java.util.Scanner;

public class Large_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the first number");
        int number1=sc.nextInt();
        System.out.println("Enter the Second number");
        int number2=sc.nextInt();
        if (number1 > number2)
        {
            System.out.println(number1 + " is the largest number");
        }
        else{
            System.out.println(number2 + "I s the largest number");
        }
    }
}
