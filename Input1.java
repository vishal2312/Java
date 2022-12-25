import java.util.*;

public class Input1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String - ");
        String word = sc.next();
        System.out.println("The Word is "+word);

        System.out.print("\nEnter Boolean Value - ");
        boolean bool = sc.nextBoolean();
        System.out.println("The Boolean value is "+bool);

        System.out.print("\nEnter Byte Value - ");
        byte num1 = sc.nextByte();
        System.out.println("The Byte value is "+num1);

        System.out.print("\nEnter Short Value - ");
        short num2 = sc.nextShort();
        System.out.println("The Short Value is "+num2);

        sc.close();


    }
}
