import java.util.*;

public class BreakKeyword {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter Number - ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                break;
            }
            System.out.println(num);
        } while(true);

        System.out.println("Multiple of 10 is not accepted");
        
        sc.close();
    } 
}
