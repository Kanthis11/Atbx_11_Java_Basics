package Triangle;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the first side");
        int s1=sc.nextInt();
        System.out.println("Enter the Second side ");
        int s2=sc.nextInt();
        System.out.println("Enter the Third side");
        int s3=sc.nextInt();
        if(s1==s2 && s2==s3){
            System.out.println("Its an equilateral traingle");
        }
        else if(s1==s2 || s1==s3 || s2==s3 ){
            System.out.println("Its an isosceles triangle");
        }
        else{
            System.out.println("It a scalene triangle");
        }

    }
}

