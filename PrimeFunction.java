public class PrimeFunction {

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
    public static void main(String args[]){

        System.out.println(prime(4));
    }
}
