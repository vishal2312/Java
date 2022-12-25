public class LinearSearch {

    public static int LinearInteger(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int LinearString(String snacks[], String item) {
        for(int i = 0; i < snacks.length; i++) {
            if(snacks[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        
        // Integer Linear Search
        int numbers[] = {2, 4, 6, 8, 10, 12, 14,16};
        int key = 10;
        if(LinearInteger(numbers, key) == -1) {
            System.out.println("Key "+key+" not found");
        } else{
            System.out.println("Key "+key+" is at index "+LinearInteger(numbers, key));
        }

        // String Linear Search
        String snacks[] = {"Samosa", "Chinese", "Chai", "Coke", "Franky"};
        String item = "Chai";
        if(LinearString(snacks, item) == -1) {
            System.out.println("Item "+item+" not found");
        } else{
            System.out.println("Item "+item+" is at index "+LinearString(snacks, item));
        }
    }
}
