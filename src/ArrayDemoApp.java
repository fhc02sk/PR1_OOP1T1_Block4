import java.util.Arrays;

public class ArrayDemoApp {
    public static void main(String[] args) {

        int[] arr = {87, 12, 5, 3, 4, 1, 45, 17, 31, 3, 5, 7};

        printArray(arr);

        System.out.println("containsNumber(arr, 31) = " + containsNumber(arr, 31));
        System.out.println("containsNumber(arr, 32) = " + containsNumber(arr, 32));
        System.out.println("containsNumber(arr, 3) = " + containsNumber(arr, 3));

        System.out.println("calculateSum(arr) = " + calculateSum(arr));

        System.out.println("Hello World");

        int[] ihrName = reverse(arr);
        System.out.println("StringResult: " + arrayToString(ihrName));

        int[] reversedarr2 = reverse2(arr);
        printArray(reversedarr2);
        System.out.print("Arr: ");
        printArray(arr);

        int[] reversearr3 = reverse3(arr);
        System.out.println("Variante 3: " + Arrays.toString(reversearr3));
    }

    public static String arrayToString(int[] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i] + ", ";
        }
        return result;
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
        }
         */
        
        return sum;
    }

    public static int[] reverse(int[] numbers){
        int[] reversedResult = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int newIndex = numbers.length -1 -i;
            reversedResult[newIndex] = numbers[i];
        }
        return reversedResult;
    }

    public static int[] reverse2(int[] numbers){
        for (int i = 0; i < numbers.length / 2; i++){
            int newIndex = numbers.length -1 - i;
            int temp = numbers[i]; // 87
            numbers[i] = numbers[newIndex];
            numbers[newIndex] = temp;
        }
        return numbers;
    }

    public static int[] reverse3(int[] numbers) {

        int[] reversedResult = new int[numbers.length];
        int newIndex = numbers.length - 1; // 9

        for(int i = 0; i < numbers.length; i++){
            reversedResult[newIndex] = numbers[i];
            newIndex--;
        }

        return reversedResult;
    }

}
