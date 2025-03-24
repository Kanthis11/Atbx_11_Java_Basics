public class Stringex {
    public static void main(String[] args) {
        //Immutable
        String name = "Star";
        name.toUpperCase();
        System.out.println(name);

        //String can be created two ways
        String s1 = "Moon";
        String s2 = new String("moon"); // OA -> Object Area
        System.out.println(s1 + "and " + s2);

        //Concatination

        String s3 = "hello";
        s3 = s3.concat("world"); // concat add the values , merge the values
        System.out.println(s3);

        //String Functions
        char c = 'A';
        System.out.println(c);

        String s4 = "Bat";
        System.out.println(s4.length());
        System.out.println(s4.toLowerCase());
        System.out.println(s4.toUpperCase());
        System.out.println(s4.concat("S"));


    }

}
