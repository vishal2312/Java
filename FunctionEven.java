import java.util.*;

public class FunctionEven {

    public static boolean isEven(int n) {
        boolean isEven = false;
        if(n % 2 == 0){
            isEven = true;
        }
        return isEven;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - ");
        int n = sc.nextInt();

        if(isEven(n) == true){
            System.out.println(+n+" is an Even Number");
        } else{
            System.out.println(+n+" is an Odd Number");
        }

        sc.close();
    }
}
