import java.util.*;

public class PalindromeNumber {

    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int LastDigit = n % 10;
            rev = (rev * 10) + LastDigit;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number - ");
        int n = sc.nextInt();

        if(n == reverse(n)){
            System.out.println("Reverse of "+n+" is "+reverse(n)+" So it is a Palindrome");
        } else{
            System.out.println("Reverse of "+n+" is "+reverse(n)+" So it is not a Palindrome");
        }

        sc.close();
    }
}
