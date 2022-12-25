import java.util.*;

public class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number - ");
        int num = sc.nextInt();

        switch(num) {
            case 1 : System.out.println("You have won a Fridge");
                        break;
            case 2 : System.out.println("You have won a Wall Clock");
                        break;
            case 3 : System.out.println("You have won a Washing Machine");
                        break;
            case 4 : System.out.println("You have won a Car");
                        break;
            default : System.out.println("Better Luck Next Time");
        }

        sc.close();
    }
}
