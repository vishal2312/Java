import java.util.*;

public class Input2 {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Sentence - ");
    String sentence = sc.nextLine();
    System.out.println("The sentence is "+sentence);

    System.out.print("\nEnter a Integer - ");
    int num1 = sc.nextInt();
    System.out.println("The Integer Value is "+num1);

    System.out.print("\nEnter a Long Value - ");
    long num2 = sc.nextLong();
    System.out.println("The Long Value is "+num2);

    System.out.print("\nEnter a Float Value - ");
    float num3 = sc.nextFloat();
    System.out.println("The Float Value is "+num3);

    System.out.print("\nEnter a Double Value - ");
    double num4 = sc.nextDouble();
    System.out.println("The Double Value is "+num4);

    sc.close();
    
   } 
}
