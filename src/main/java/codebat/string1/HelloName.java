package codebat.string1;

public class HelloName {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Dolly"));
        System.out.println(helloName("Alpha"));
        System.out.println(helloName("Omega"));
        System.out.println(helloName("Goodbye"));
        System.out.println(helloName("ho ho ho"));
        System.out.println(helloName("xyz!"));
        System.out.println(helloName("Hello"));
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

}
