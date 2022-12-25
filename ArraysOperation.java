import java.util.Arrays;

public class ArraysOperation {
    public static void main(String args[]) {

        int marks[] = {78, 94, 82, 45, 63};
        System.out.println("Array = "+Arrays.toString(marks));

        // Updating a value in array
        marks[0] = 99;

        // Updating value using arithmetic operation
        marks[1] = marks[1] - 10;

        System.out.println("Modified Array = "+Arrays.toString(marks));

        // Calculating percentage of array
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3]) / 4;

        System.out.println("Percentage = "+percentage+"%");

        // Length of array
        System.out.println("Length of Array = "+marks.length);


    }
}
