public class Largest2Number {
    public static void main(String args[]) {

        int a = 1;
        int b = 11;
        int c = 6;

        if((a >= b) && (a >= c)){
            System.out.println("The Largest Number is "+a);
        }
        else if(b >= c){
            System.out.println("The Largest Number is "+b);
        }
        else{
            System.out.println("The Largest Number is "+c);
        }
    }
}
