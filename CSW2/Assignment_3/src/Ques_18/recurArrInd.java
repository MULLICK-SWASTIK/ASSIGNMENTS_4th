package Ques_18;

public class recurArrInd {
    public static int calculateSum(int[] array, int index) {
        // Base case: if index is out of bounds, return 0
        if (index < 0 || index >= array.length) {
            return 0;
        }

        // Recursive case: sum current element and recursively call for next index
        return array[index] + calculateSum(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        // Scenario 1: Accessing elements within bounds
        System.out.println("Sum of elements within bounds: " + calculateSum(array, 0));

        // Scenario 2: Accessing elements beyond bounds
        try {
            System.out.println("Sum of elements beyond bounds: " + calculateSum(array, 10)); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
// OUTPUT
// Sum of elements within bounds: 15
// Sum of elements beyond bounds: 0