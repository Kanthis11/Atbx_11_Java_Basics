import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter your Age");
        int age=sc.nextInt();
        System.out.println("Enter your Name");
        String name= sc.next();
        System.out.println("Enter your Salary");
        long salary=sc.nextLong();
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);

    }
}
