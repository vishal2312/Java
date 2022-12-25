import java.util.*;

public class ReverseArrays {

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        while(first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
        System.out.println(Arrays.toString(numbers));
    }
    
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        
        reverse(numbers);
    
    }
}
