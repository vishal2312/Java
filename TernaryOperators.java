import java.util.*;

public class TernaryOperators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - ");
        int num = sc.nextInt();

        String result = (num % 2 == 0)? "Even" : "Odd";

        System.out.println("The Number is "+result);

        sc.close();
    }
}
