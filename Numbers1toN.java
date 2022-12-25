import java.util.*;

public class Numbers1toN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numbers printed from 1 - ");
        int n = sc.nextInt();

        int count = 1;

        while(count <= n){
            System.out.println(count);
            count++;
        }

        sc.close();
    }
}
