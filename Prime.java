import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - ");
        int n = sc.nextInt();

        if(n == 0 || n == 1){
            System.out.println("It is Not Prime Number");
        } else{
            boolean isPrime = true;
            
            for(int i = 2; i <= n-1; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("It is a Prime Number");
            } else{
                System.out.println("It is Not Prime Number");              
            }
        }
        
        

        sc.close();
    }
}
