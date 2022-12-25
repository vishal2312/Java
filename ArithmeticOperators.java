import java.util.*;

public class ArithmeticOperators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a - ");
        int a = sc.nextInt();

        System.out.print("Enter value of b - ");
        int b = sc.nextInt();

        // Addition
        int add = a + b;
        System.out.println("\nAddition of a and b is "+add);

        // Subtraction
        int subtract = a - b;
        System.out.println("\nSubtraction of a and b is "+subtract);

        // Multiplication
        int multiply = a * b;
        System.out.println("\nMultiplication of a and b is "+multiply);

        // Divison
        int divide = a / b;
        System.out.println("\nDivision of a and b is "+divide);

        // Modulus - Remainder 
        int mod = a % b;
        System.out.println("\nModulus of a and b is "+mod);

        sc.close();

    }
}
