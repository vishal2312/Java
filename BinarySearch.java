public class BinarySearch {

    public static int BinaryInteger(int numbers[], int key) {

        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key) {
                return mid;
            } else if(numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {

        // Integer Binary Search
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        System.out.println("Key is found at index "+BinaryInteger(numbers, key));

    }
}
