public class ReverseNumbers {
    public static void main(String args[]) {
        
        int n = 10899;

        while(n > 0){
            int LastDigit = n % 10; // Extract last digit
            System.out.print(LastDigit);
            n = n / 10;  // Remove last digit

        }
        System.out.println();
    }
}
