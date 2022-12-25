import java.util.*;

public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a - ");
        float a = sc.nextInt();
        
        System.out.print("Enter value of b - ");
        float b = sc.nextInt();

        System.out.print("Enter value of c - ");
        float c = sc.nextInt();

        float average = (a + b + c) / 3;
        System.out.println("The Average of a, b and c is "+average);

        sc.close();
    }
}
