import java.util.*;

public class PositiveNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("The Number is Positive");
        } else{
            System.out.println("The Number is Negative");
        }

        sc.close();
    }
}
