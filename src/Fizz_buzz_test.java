public class Fizz_buzz_test {
    public static void main(String[] args) {
        for (int i=1; i<=100 ; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i + "\t FIZZ BUZZ");
            }else if (i%3==0){
                System.out.println(i + "\t FIZZ");
            }else if (i%5==0){
                System.out.println(i + "\t BUZZ");
            }else {
                System.out.println(i);
            }
        }
    }
}
