import java.util.*;

public class ReverseNumbers2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - ");
        int n = sc.nextInt();

        int reverse = 0;

        while(n > 0){
            int LastDigit = n % 10;
            reverse = (reverse * 10) + LastDigit;
            n = n / 10;
        }

        System.out.println(reverse);
        
        sc.close();
    }
}
