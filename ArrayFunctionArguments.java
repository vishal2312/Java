import java.util.Arrays;

public class ArrayFunctionArguments {

    public static void update(int numbers[], int num) {
        num = 10;
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
    public static void main(String args[]) {

        int numbers[] = {97, 98, 99};
        int num = 5;

        update(numbers, num);
        System.out.println(num);

    }
}
