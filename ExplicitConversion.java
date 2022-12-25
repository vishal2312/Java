public class ExplicitConversion {
    public static void main(String args[]) {

        // double to float, long, int, char, short, byte conversion is possible explicitly. 
        double a = 97.99;
        long b = (long)a;
        System.out.println("\ndouble to long conversion b = "+b);
        

        // float to long, int, char, short, byte conversion is possible explicitly. 
        float c = 97.99f;
        int d = (int)c;
        System.out.println("\nfloat to int conversion d = "+d);


        // long to int, char, short, byte conversion is possible explicitly. 
        long e = 17;
        int f = (int)e;
        System.out.println("\nlong to int conversion f = "+f);


        // int to char, short, byte conversion is possible explicitly. 
        int g = 41;
        char h = (char)g;
        System.out.println("\nint to char conversion h = "+h);

        
        // char to short, byte conversion is possible explicitly. 
        char i = 'a';
        short j = (short)i;
        System.out.println("\nchar to short conversion j = "+j);


        // short to byte conversion is possible explicitly. 
        short k = 56;
        byte l = (byte)k;
        System.out.println("\nshort to byte conversion l = "+l);
    }    
}
