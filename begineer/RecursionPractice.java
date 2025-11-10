package begineer;

public class RecursionPractice {

    public static void main(String[] args) {
       System.out.println(fibonaciSeries(6));

    }
    
    public static int fibonaciSeries(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int f1 = fibonaciSeries(n - 1);
        int f2 = fibonaciSeries(n - 2);
        
        int ans = f1 + f2;
        return ans;
    }
    
}
