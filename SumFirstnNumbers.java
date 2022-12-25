import java.util.*;

public class SumFirstnNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sum of Numbers from 1 - ");
        int n = sc.nextInt();

        int count = 1;

        int sum = 0;

        while(count <= n){
            sum += count;
            count++;
        }

        System.out.println(sum);

        sc.close();
    }
}
