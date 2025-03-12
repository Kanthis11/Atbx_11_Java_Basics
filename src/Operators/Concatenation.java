package Operators;

public class Concatenation {
    public static void main(String[] args) {
        String first_name = "Kanthi";
        String last_name = "Saran";

        int a = 16;
        int b = 22;

        System.out.println(first_name + last_name + a + b);
        // // KanthiSaran - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub




    }
}
