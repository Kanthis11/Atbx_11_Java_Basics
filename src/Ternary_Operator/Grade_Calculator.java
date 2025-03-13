package Ternary_Operator;

public class Grade_Calculator {
    public static void main(String[] args) {
        String marks=args[0];
        System.out.println(marks);
        int mark= Integer .parseInt(marks);
        String grade= (mark>=90 && mark<=100) ? "A" : (mark>=80 && mark<=89) ? "B" : (mark>=70 && mark<=79) ? "C" : (mark>=60 && mark<=69) ? "D": "F" ;
        System.out.println(grade);

    }
}
