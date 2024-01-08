import java.util.*;

public class sumofsubarray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(findSum(nums));
    }

    public static int findSum(int[] nums) {
        int sum = 0;
        int max_value = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum < 0) {
                sum = 0;
            } else if (sum > max_value) {
                max_value = sum;
            }
        }
        return max_value;
    }
}