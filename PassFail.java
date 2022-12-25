import java.util.*;

public class PassFail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks - ");
        int marks = sc.nextInt();

        String result = (marks >= 35)? "PASSED" : "FAILED";

        System.out.println("The Student has "+result+" the exam");


        sc.close();
    }
}
