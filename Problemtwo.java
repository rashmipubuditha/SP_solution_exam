import java.util.ArrayList;

public class Problemtwo {
    public static void main(String[] args) {
        char[] list1 = {'a', 'b', 'c'};
        int[] list2 = {1, 2, 3};
        
        // Create ArrayList 
        ArrayList<Object> combinedList = new ArrayList<>();
        
        // Combine two lists
        for (int i = 0; i < list1.length; i++) {
            combinedList.add(list1[i]);
            combinedList.add(list2[i]);
        }
        
        System.out.println(combinedList);
    }
    }
    
