import java.util.*;

public class Cost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of pencil - ");
        float pencil = sc.nextInt();

        System.out.print("Enter cost of pen - ");
        float pen = sc.nextInt();

        System.out.print("Enter cost of eraser - ");
        float eraser = sc.nextInt();

        float total = pencil + pen + eraser;

        float bill = total + (total * 0.18f);
        System.out.println("Total cost of the items is "+bill);

        sc.close();

    }
}
