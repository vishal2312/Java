public class overloaddatatype {

    public static int multiply(int a, int b){
        return a * b;
    }

    public static float multiply(float a, float b){
        return a * b;
    }
    public static void main(String args[]){
        System.out.println("int multiplication = "+multiply(5, 6));
        System.out.println("float multiplication = "+multiply(5.512f, 6.354f));
    }
}
