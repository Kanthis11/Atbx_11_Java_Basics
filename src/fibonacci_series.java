import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N= sc.nextInt();
        int num1=0 , num2=1;
        for (int i=0;i<N;i++)
        {
            System.out.println(num1 + " ");
            int num3=num2+num1;
            num1=num2;
            num2=num3;
        }
    }
}
