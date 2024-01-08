 **can also try this

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] array1 = nums1;
        int[] array2 = nums2;

        int[] combined = new int[array1.length + array2.length];

        System.arraycopy(array1,0,combined,0,array1.length);
        System.arraycopy(array2,0,combined,array1.length,array2.length);

        Arrays.sort(combined);

        int length = combined.length;

        if(length % 2 == 0){
            return (combined[length/2]-1 + combined[length/2])/2.0;
        }else{
            return combined[length/2];
        }
        
    }
}