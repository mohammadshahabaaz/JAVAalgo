// import java.util.*;

// public class FindDuplicateArray {
// public static void main(String[] args) {
// int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
// int[] duplicate = duplicateArray(nums);
// System.out.println(Arrays.toString(duplicate));
// }

// public static int[] duplicateArray(int[] nums) {
// Set<Integer> seen = new HashSet<>();
// List<Integer> duplicateList = new ArrayList<>();

// int n = nums.length;

// for (int i = 0; i < n; i++) {
// if (!seen.add(nums[i])) {
// if (!duplicateList.contains(nums[i])) {
// duplicateList.add(nums[i]);
// }
// }
// }

// int[] duplicates = new int[duplicateList.size()];

// for (int i = 0; i < duplicates.length; i++) {
// duplicates[i] = duplicateList.get(i);
// }
// return duplicates;
// }
// }

import java.util.*;

public class FindDuplicateArray {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(Arrays.toString(duplicate(nums).toArray()));
    }

    public static List<Integer> duplicate(int[] nums) {

        List<Integer> duplicateList = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                if (nums[i] == nums[j] && !duplicateList.contains(nums[i])) {
                duplicateList.add(nums[i]);
                break;
            }
            }
        }

        return duplicateList;

    }

}
