import java.util.Scanner;

public class LargestTwice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read n
        int n = sc.nextInt();

        // Read array elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find the largest element and its index
        int max = nums[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Check if largest >= 2 * every other element
        for (int i = 0; i < n; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                System.out.println(-1);
                return;
            }
        }

        // Print index or -1
        System.out.println(maxIndex);
    }
}
