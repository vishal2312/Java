import java.util.*;

public class FunctionsAverage {

    public static float Average(float a, float b, float c){
        float avg = (a + b + c) / 3;
        return avg;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a - ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b - ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c - ");
        int c = sc.nextInt();

        System.out.println("The Average of "+a+", "+b+" and "+c+" is "+Average(a, b, c));

        sc.close();
    }

    
}
