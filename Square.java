import java.util.*;

public class Square {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of side - ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area of Square is "+area);

        sc.close();
        
    }
}
