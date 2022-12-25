import java.util.*;

public class SumEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        int choice;
        int SumEven = 0;
        int SumOdd = 0;

        do{
            System.out.print("Enter Number - ");
            n = sc.nextInt();

            if(n % 2 == 0){
                SumEven += n;
            } else{
                SumOdd += n;
            }

            System.out.print("Enter 1 to continue and enter 0 to terminate - ");
            choice = sc.nextInt();


        }while(choice == 1);

        System.out.println(SumEven);
        System.out.println(SumOdd);

        sc.close();
    }
}
