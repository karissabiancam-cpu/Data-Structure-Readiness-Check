public class Main {

    public static void main(String[] args) {
        // Sample input dataset (e.g., system response times or test scores)
        int[] dataStream = {85, 42, 91, 18, 73, 60, 42, 100, 55, 18};

        System.out.println("=== Data_Structures_Gatekeeper: Verification Protocol ===");
        System.out.print("Input Array: ");
        printArray(dataStream);

        // Call utility method to process and filter the data
        int[] filteredData = extractEvenNumbers(dataStream);

        System.out.print("Filtered Output (Even Values Only): ");
        printArray(filteredData);

        System.out.println("Status: Logic compilation successful. Ready for presentation.");
    }

    /**
     * Utility Method: Filters an input array of integers, extracting only even numbers.
     *
     * @param input raw integer array to process
     * @return a new integer array containing only even values
     */
    public static int[] extractEvenNumbers(int[] input) {
        // Edge Case Check: Handle null or empty arrays safely
        if (input == null || input.length == 0) {
            return new int[0];
        }

        // Pass 1: Count even values to allocate an array of exact required size
        int count = 0;
        for (int value : input) {
            if (value % 2 == 0) {
                count++;
            }
        }

        // Pass 2: Populate the result array with matching elements
        int[] evensOnly = new int[count];
        int targetIndex = 0;

        for (int i = 0; i < input.length; i++) {
            // Conditional statement for filtering
            if (input[i] % 2 == 0) {
                evensOnly[targetIndex] = input[i];
                targetIndex++;
            }
        }

        return evensOnly;
    }

    /**
     * Helper Method: Displays array contents clearly in console.
     */
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}