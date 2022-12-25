public class ArrayLargestSmallestNumber {

    public static void LargestSmallestNumber(int numbers[]) {
        
        int Largest = Integer.MIN_VALUE; // -Infinity
        int Smallest = Integer.MAX_VALUE; // +Infinity

        for(int i = 0; i < numbers.length; i++) {

            // Largest in Array
            if(Largest < numbers[i]) {
                Largest = numbers[i];
            }

            // Smallest in Array
            if(Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        System.out.println("The Largest number in array is "+Largest);
        System.out.println("The Smallest number in array is "+Smallest);
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 3, 5};

        LargestSmallestNumber(numbers);
    }
}
