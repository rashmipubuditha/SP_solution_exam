public class Problemone {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        int sum_for = 0;
    
        // for loop
        for (int i : num){
            sum_for += i;       
        }   
        System.out.println("Sum using for loop:"+sum_for);
    
    
        // while loop
        int j = 0;
        int sum_while = 0;
        while (j<=num.length){
            sum_while += j;
            j++;
        }
        System.out.println("Sum using while loop:"+sum_while);
    
    
        // Recursion
        int sum_rec = sum(num, num.length);
        System.out.println("Sum using recursion:" + sum_rec);
    }
    
    
    
        public static int sum(int[] num, int n) {
            if (n == 0) {
                return 0;
            }
            return sum(num, n - 1) + num[n - 1];
        }
    
}
