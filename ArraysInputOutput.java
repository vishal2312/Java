import java.util.*;

public class ArraysInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an array
        int marks[] = new int[5];

        System.out.print("0th index = ");
        marks[0] = sc.nextInt();

        System.out.print("1st index = ");
        marks[1] = sc.nextInt();

        System.out.print("2nd index = ");
        marks[2] = sc.nextInt();

        System.out.print("3rd index = ");
        marks[3] = sc.nextInt();

        System.out.print("4th index = ");
        marks[4] = sc.nextInt();

        // Arrays.toString(arrayname) is used to print whole array
        System.out.println("marks = "+Arrays.toString(marks));

        sc.close();
    }
}
