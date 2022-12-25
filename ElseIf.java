import java.util.*;

public class ElseIf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age - ");
        int age = sc.nextInt();
        
        if(age >= 18){
            System.out.println("Adult");
        }
        else if(age >= 13 && age <= 18){
            System.out.println("Teenage");
        }
        else{
            System.out.println("Kid");
        }

        sc.close();

    }
}
