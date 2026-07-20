public class Main {

    public static void main(String[] args) {
        int[] dataStream = {85, 42, 91, 18, 73, 60, 42, 100, 55, 18};

        System.out.println("=== Data_Structures_Gatekeeper: Verification Protocol ===");
        System.out.print("Input Array: ");
        printArray(dataStream);

        int[] filteredData = extractEvenNumbers(dataStream);

        System.out.print("Filtered Output (Even Values Only): ");
        printArray(filteredData);

        System.out.println("Status: Logic compilation successful. Ready for presentation.");
    }

    public static int[] extractEvenNumbers(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int count = 0;
        for (int value : input) {
            if (value % 2 == 0) {
                count++;
            }
        }

        int[] evensOnly = new int[count];
        int targetIndex = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                evensOnly[targetIndex] = input[i];
                targetIndex++;
            }
        }

        return evensOnly;
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}