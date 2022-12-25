public class BinaryToDecimal {

    public static int Conversion(int n){
        int decimal = 0;

        for(int i = 0; n > 0; i++){
            int LastDigit = n % 10;
            decimal += LastDigit * (Math.pow(2, i));
            n /= 10;
        }
        return decimal;

    }
    public static void main(String args[]){
        int n = 110;

        System.out.println("The Decimal Conversion of "+n+" is "+Conversion(n));
    }
}
