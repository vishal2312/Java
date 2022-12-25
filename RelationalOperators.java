import java.util.*;

public class RelationalOperators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a - ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b - ");
        int b = sc.nextInt();

        // Equal to
        System.out.println("\nEqual To");
        System.out.println("a == b is "+(a == b));

        // Not Equal to
        System.out.println("\nNot Equal To");
        System.out.println("a != b is "+(a != b));

        // Greater than
        System.out.println("\nGreater Than");
        System.out.println("a > b is "+(a > b));

        // Less than
        System.out.println("\nLess Than");
        System.out.println("a < b is "+(a < b));

        // Greater than or Equal to
        System.out.println("\nGreater Than Or Equal To");
        System.out.println("a >= b is "+(a >= b));

        // Less than or Equal to
        System.out.println("\nLess Than Or Equal To");
        System.out.println("a <= b is "+(a <= b));

        sc.close();

    }
} 
