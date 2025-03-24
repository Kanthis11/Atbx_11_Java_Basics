import java.util.Scanner;

public class vowel_cons {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String str= sc.next();
        int vowels=0 ; int c=0;
        str=str.toLowerCase();
        for (int i = 0; i<str.length() ; i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                vowels++;
            }else {
                c++;
            }

        }
        System.out.println("vowels=" + vowels);
        System.out.println("Constant=" + c);
    }
}
