package auto.ai;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Square Root");
            System.out.println("6: Exit");
            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            double num1 = 0, num2 = 0;
            if (choice != 5) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } else {
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.divide(num1, num2));
                    break;
                case 5:
                    System.out.println("Result: " + calculator.sqrt(num1));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return a / b;
    }

    public double sqrt(double a) {
        if (a < 0) {
            System.out.println("Error: Negative input");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }
}