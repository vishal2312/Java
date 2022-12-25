public class PrimeRange {

    public static boolean prime(int n){

        boolean isPrime = true;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void rangeprime(int n){
        
        for(int i = 2; i <= n; i++){
            if(prime(i)){
                System.out.print(i+" ");             
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        rangeprime(20);
    }
}
