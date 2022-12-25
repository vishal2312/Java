public class CallByValue {

    public static void Swap(int a, int b){
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }

    public static void main(String args[]){

        int a = 5;
        int b = 10;

        System.out.println("Before Swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        Swap(a, b);
    }
}
