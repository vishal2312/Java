import java.util.*;

public class LargestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number - ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number - ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("The Largest Number is "+a);
        }
        else{
            System.out.println("The Largest Number is "+b);
        }

        sc.close();
    }
}
