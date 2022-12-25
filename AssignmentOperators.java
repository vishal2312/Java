public class AssignmentOperators {
    public static void main(String args[]) {

        int a = 5;
        int b = 10;

        System.out.println("a = b");
        System.out.println("Current value of a is "+a);
        a = b;
        System.out.println("a = b value of a is "+a);

        System.out.println("\na += 10 is same as a = a + 10");
        System.out.println("Current value of a is "+a);
        a += 10;
        System.out.println("a += 10 value of a is "+a);

        System.out.println("\na -= 10 is same as a = a - 10");
        System.out.println("Current value of a is "+a);
        a -= 10;
        System.out.println("a -= 10 value of a is "+a);

        System.out.println("\na *= 10 is same as a = a * 10");
        System.out.println("Current value of a is "+a);
        a *= 10;
        System.out.println("a *= 10 value of a is "+a);

        System.out.println("\na /= 10 is same as a = a / 10");
        System.out.println("Current value of a is "+a);
        a /= 10;
        System.out.println("a /= 10 value of a is "+a);

        System.out.println("\na %= 10 is same as a = a % 10");
        System.out.println("Current value of a is "+a);
        a %= 10;
        System.out.println("a %= 10 value of a is "+a);

    }
}
