public class UnaryOperators {
    public static void main(String args[]) {

        // Pre Increment
        // value is changed first and then value is assigned
        int a = 10;
        int b = ++a;
        System.out.println("Pre Increment");
        System.out.println("value of a is changed first and then value is assigned to b");
        System.out.println("value of a - "+a);
        System.out.println("value of b - "+b);

        // Post Increment
        // value is assigned first and then value is changed
        int c = 10;
        int d = c++;
        System.out.println("\nPost Increment");
        System.out.println("value of a is assigned first and then value is changed to b");
        System.out.println("value of a - "+c);
        System.out.println("value of b - "+d);

        // Pre Decrement
        // value is changed first and then value is assigned
        int e = 10;
        int f = --e;
        System.out.println("\nPre Decrement");
        System.out.println("value of a is changed first and then value is assigned to b");
        System.out.println("value of a - "+e);
        System.out.println("value of b - "+f);

        // Post Decrement
        // value is assigned first and then value is changed
        int g = 10;
        int h = g--;
        System.out.println("\nPost Decrement");
        System.out.println("value of a is assigned first and then value is changed to b");
        System.out.println("value of a - "+g);
        System.out.println("value of b - "+h);

    }
}
