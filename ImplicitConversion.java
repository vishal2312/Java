public class ImplicitConversion {
    public static void main(String args[]) {

        // byte to short, int, long, float, double conversion is possible implicitly.    
        byte a = 25;
        short b = a;
        System.out.println("Byte to Short conversion b = "+b);


        // short to int, long, float, double conversion is possible implicitly.
        short c = 13;
        int d = c;
        System.out.println("\nShort to Int conversion d = "+d);


        // char to int, float, long, double conversion is possible implicitly.
        char q = 'Z';
        int r = q;
        System.out.println("\nChar to Int conversion r = "+r);


        // int conversions to float, long, double is posssible implicitly.
        int e = 56;
        float f = e;
        System.out.println("\nInt to Float conversion f = "+f);


        // long to float, double conversion is possible implicitly.
        long k = 56;
        float l = k;
        System.out.println("\nLong to Float conversion h = "+l);


        // float to double conversion is possible implicitly.
        float o = 56.34f;
        double p = o;
        System.out.println("\nFloat to Double conversion p = "+p);


        
    }
}
