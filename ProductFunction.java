import java.util.*;

public class ProductFunction {

    public static int CalulateProduct(int a, int b){
        int product = a * b;
        return product;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a - ");
        int a = sc.nextInt();

        System.out.print("Enter value of b - ");
        int b = sc.nextInt();

        System.out.println("The product of a & b is "+CalulateProduct(a, b));

        System.out.println("The product of a & b is "+CalulateProduct(10, 5));

        sc.close();

    }
}
