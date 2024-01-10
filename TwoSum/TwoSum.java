// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

import java.util.*;

public class TwoSum {

    public static int[] findtwoIndicies(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        throw new IllegalArgumentException("no solution found");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };

        int target = 9;

        int[] indices = findtwoIndicies(nums, target);

        System.out.println("indices1 : " + indices[0] + " indices2 : " + indices[1]);
        System.out.println("Number1 : " + nums[indices[0]] + " Number2 : " + nums[indices[1]]);
        System.out.println("indices : " + Arrays.toString(indices));

    }
}
