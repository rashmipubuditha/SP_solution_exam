import java.util.Arrays;

public class Problemfour {
    public static void main(String[] args) {

        int[] numbers = {50, 2, 1, 9};
        String largestNumber = largestNumber(numbers);
        System.out.println(largestNumber);
    }
    

    public static String largestNumber(int[] numbers) {
        // Convert integers to strings
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        // Sort the array
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));
        
        // get largest number
        StringBuilder result = new StringBuilder();
        for (String num : strNumbers) {
            result.append(num);
        }
        
        return result.toString();
    }
}
