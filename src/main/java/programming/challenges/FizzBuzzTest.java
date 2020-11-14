package programming.challenges;

public class FizzBuzzTest {
    public static void main(String[] args) {
    printFizzBuzz(10);
}

    public static void printFizzBuzz(int input) {
        for(int i = 1; i <= input;i++) {
            if( i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0){
                System.out.println("Fizz");
            } else if(i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    }
/*
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
 */