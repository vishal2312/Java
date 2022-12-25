import java.util.*;

public class Product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a - ");
        int a = sc.nextInt();

        System.out.print("Enter value of b - ");
        int b = sc.nextInt();

        int prod = a * b;
        System.out.println("The Product of a & b is "+prod);

        sc.close();
    }
}