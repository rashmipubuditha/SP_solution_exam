public class Problemthree {
    public static void main(String[] args) {
       
        long[] fbNumbers = fibonacci(100);
        
        for (int i = 0; i < 100; i++) {
            System.out.print(fbNumbers[i] + " ");
        }
        
    }

    public static long[] fibonacci(int n) {
        long[] fb = new long[n];
        
        // 0 and 1
        fb[0] = 0;
        fb[1] = 1;
        
        // next fibonacci numbers
        for (int i = 2; i < n; i++) {
            fb[i] = fb[i - 1] + fb[i - 2];
        }
        return fb;
    }
    
}
