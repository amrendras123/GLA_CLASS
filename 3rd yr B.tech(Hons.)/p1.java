import java.util.ArrayList;
import java.util.List;

/**
 * p1
 public class SumOfQueries {
    public static void main(String[] args) {
        int[] queries = {1, 2, 3}; 

        int result = check(queries);
        System.out.println(result);
    }

    public static int check(int[] queries) {
        long sum = 0; // Use a long to avoid integer overflow
        long mod = 1000000007; // 10^9 + 7

        for (int K : queries) {
            // Calculate the sum of integers from 1 to K modulo mod
            long answer = (long) K * (K + 1) / 2;
            sum = (sum + answer) % mod; // Add the answer to the running total modulo mod
        }

        return (int) sum; // Convert back to int before returning
    }
}

 */
public class p1 {

    public static void main(String[] args) {
        // int[] list={1,2,3};\
        ArrayList<Integer>list =new ArrayList<>();
        list.add(5);
        list.add(5);
        
        System.out.println(check(list));
        
    }
     public static int check(List<Integer> queries) {
        long sum = 0; 
        long mod = 1000000007; // 10^9 + 7

        for (int K : queries) {
           
            long answer = (long) K * (K + 1) / 2;
            sum = (sum + answer) % mod; 
        }

        return (int) sum; 
    }
}
