public class DecimalToBinary {

    public static int Conversion(int n){

        int bin = 0;

        for(int i = 0; n > 0; i++){
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, i));
            n = n / 2;
        }
        return bin;
    }

    public static void main(String args[]){
        int n = 7;

        System.out.println("The Binary Conversion of "+n+" is "+Conversion(n));
    }
}
