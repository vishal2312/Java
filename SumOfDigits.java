import java.util.*;

public class SumOfDigits {

    public static int sum(int n) {
        int revsum = 0;

        while(n > 0){
            int LastDigit = n % 10;
            revsum += LastDigit;
            n = n / 10;
        }
        return revsum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - ");
        int n = sc. nextInt();

        System.out.println("The sum of "+n+" is "+sum(n));

        sc.close();
    }
}
