package Even_Odd;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=sc.nextInt();
        if (n1%2==0){
            System.out.println("Its an even number");
        }
        else{
            System.out.println("Its an odd number");
        }
    }
}
