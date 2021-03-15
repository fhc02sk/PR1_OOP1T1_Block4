public class ArrayDemoApp {
    public static void main(String[] args) {

        int[] arr = {87, 12, 5, 3, 4, 1, 45, 17, 31, 3};

        printArray(arr);

        System.out.println("containsNumber(arr, 31) = " + containsNumber(arr, 31));
        System.out.println("containsNumber(arr, 32) = " + containsNumber(arr, 32));
        System.out.println("containsNumber(arr, 3) = " + containsNumber(arr, 3));

        System.out.println("calculateSum(arr) = " + calculateSum(arr));

        int[] reversedarr = reverse(arr);
        printArray(reversedarr);
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    public static boolean containsNumber(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;

        // foreach
        for (int element : numbers) {
            // int element = numbers[i];
            sum += element;
        }
        
        /*
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
         */
        
        return sum;
    }

    public static int[] reverse(int[] numbers){
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int newIndex = numbers.length -1 - i;
            result[newIndex] = numbers[i];
        }

        return result;
    }
}
