public class BinomialCoefficient {

    public static int CalculateBinomialCoeff(int n, int r){

        int fact_n = 1;
        for(int i = 1; i <= n; i++){
            fact_n *= i;
        }

        int fact_r = 1;
        for(int j =1; j <= r; j++){
            fact_r *= j;
        }

        int fact = 1;
        int nmr = n - r;
        for(int k =1; k <= nmr; k++){
            fact *= k;
        }

        int bcoeff = fact_n / (fact_r * fact);

        return bcoeff;
    }

    public static void main(String args[]){
        
        
        System.out.println("Binomial coefficient is "+CalculateBinomialCoeff(5, 2));
    }
}
