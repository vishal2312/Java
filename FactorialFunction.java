import java.util.*;

public class FactorialFunction {

    public static int CalculateFactorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number - ");
        int num = sc.nextInt();

        System.out.println("The Factorial of "+num+" is "+CalculateFactorial(num));

        System.out.println(CalculateFactorial(10));

        sc.close();

    }
}
