
import java.util.Scanner;

class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;

        while (high < n) {
            sum = sum + nums[high];

            while (sum >= target) {
                int len = high - low + 1;
                res = Math.min(res, len);

                sum = sum - nums[low];
                low++;
            }

            high++;
        }

        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        Solution obj = new Solution();

        int result = obj.minSubArrayLen(target, nums);

        System.out.println("Minimum length of subarray = " + result);

        sc.close();
    }
}
