package javaAlgo.MedianofTwoSortedArrays;

public class MedianofTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }

        }

        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        int n = merged.length;

        if (n % 2 == 0) {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        } else {
            return merged[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2, 4 };

        System.out.println("Median is :" + findMedianSortedArrays(nums1, nums2));
    }
}
