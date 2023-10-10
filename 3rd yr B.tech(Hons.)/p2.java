import java.util.ArrayList;
import java.util.List;

public class p2 {
    public static void main(String[] args) {
        // int[] arr = {-26,71,6,-3,-69};
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(-26);
        arr.add(71);
        arr.add(6);
        arr.add(-3);
        arr.add(-69);

        int score = calculateScore(5,arr);
        System.out.println( score);
    }

    public static int calculateScore(int array_length,List<Integer> arr) {
        int score = 0;
        int n = array_length;

        for (int i = 0; i < n; i++) {
           
            if (i < n - 1) {
                int coupleSum = arr.get(i) + arr.get(i+1);
                if (coupleSum % 2 == 0) {
                    score += 5;
                }
            }

            if (i < n - 2) {
                int tripletSum = arr.get(i) + arr.get(i+1) + arr.get(i+2);
                int tripletProduct = arr.get(i) * arr.get(i+1) * arr.get(i+2);
                if (tripletSum % 2 == 1 && tripletProduct % 2 == 0) {
                    score += 10;
                }
            }
        }

        return score;
    }
}