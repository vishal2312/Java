import java.util.*;

public class Functions {

    public static int CalculateSum(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a - ");
        int a = sc.nextInt();

        System.out.print("Enter value of b - ");
        int b = sc.nextInt();

        System.out.println("The sum of a & b is "+CalculateSum(a, b));

        sc.close();

    }
}
