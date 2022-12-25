public class TypePromotionExpressions {
    public static void main(String args[]) {
        /*
         * Java automatically promotes each byte, short or char 
         * operand to int while evaluating an expression.
         */

        byte a = 25;
        short b = 36;
        char c = 'a';
        System.out.println(a+b+c);

        /*
         * If one operand is long, float or double the whole
         * expression is promoted to long, float or double.  
         */

        int d = 32;
        long e = 12;
        float f = 12.55f;
        double g = 34.66;
        System.out.println(d+e+f+g);
    }
}
