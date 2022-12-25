public class overloadparameter {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String args[]){
        System.out.println("Sum of 2 numbers is "+sum(5, 8));
        System.out.println("Sum of 3 numbers is "+sum(7, 9, 6));
    }
}
