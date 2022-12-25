import java.util.*;

public class Add {
    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a - ");
        int a = sc.nextInt();

        System.out.print("Enter value of b - ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The Sum of a & b is "+sum);

        sc.close();
    }    
}
