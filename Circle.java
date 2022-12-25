import java.util.*;

public class Circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of r - ");
        int r = sc.nextInt();

        float area = 3.14f * (r * r);
        System.out.println("The Area of Circle is "+area);

        sc.close();
    }
}
