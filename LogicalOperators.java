public class LogicalOperators {
    public static void main(String args[]) {

        int a = 25;
        int b = 15;
        int c = 20;

        System.out.print("Logical AND - &&");
        System.out.println("\n(a > b) && (b > c) is "+((a > b) && (b > c)));

        System.out.print("\nLogical OR - ||");
        System.out.println("\n(a > b) || (b > c) is "+((a > b) || (b > c)));

        System.out.print("\nLogical NOT - !");
        System.out.println("\n!(a > b) is "+(!(a > b)));

    }
}
