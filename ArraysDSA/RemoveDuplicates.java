// public class RemoveDuplicates {

//     public static void main(String[] args) {
//         int[] nums = { 0, 0, 1, 1, 2, 2, 3, 3, 4 };

//         int newLength = remove(nums);
//         for (int i = 0; i < newLength; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }

//     public static int remove(int[] nums) {
//         if (nums.length == 0) {
//             return 0;
//         }

//         int i = 0;

//         for (int j = 1; j < nums.length; j++) {
//             if (nums[j] != nums[i]) {
//                 i++;
//                 nums[i] = nums[j];
//             }
//         }

//         return i + 1;

//     }

// }

// import java.util.*;

// public class RemoveDuplicates {
// public static void main(String[] args) {
// int[] nums = { 1, 2, 7, 8, 7, 8, 7, 8, 7, 8, 7, 8 };

// System.out.println(remove(nums));

// }

// public static int remove(int[] nums) {
// int count = 0;

// for (int i = 0; i < nums.length; i++) {
// if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
// continue;
// } else {
// nums[count] = nums[i];
// count++;
// }
// }

// return count;
// }

// }

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 7, 8, 7, 8, 7, 8, 7, 8, 7, 8 };
        int newLength = removeDuplicates(nums);
        for (int i = 0; i < newLength; i++) {

            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();

        int index = 0;

        for (int num : nums) {
            if (seen.add(num)) {
                nums[index++] = num;
            }
        }

        // for (int i = 0; i < nums.length; i++) {
        // if (!seen.add(nums[i])) {
        // seen.add(nums[i]);
        // nums[index] = nums[i];
        // index++;
        // }
        // }

        return index;

    }

}
