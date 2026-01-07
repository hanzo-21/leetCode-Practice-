package leetcodeModule;

import java.util.Arrays;

public class MedianOfTwoSortedArrays_naiveApproach {

    public static  int[] combinedSort(int[] nums1, int[] nums2){
        int[] combinedArray = new int[nums1.length + nums2.length];
        int indexOfnum1 = 0 ;
        int indexOfnum2 =0  ;
        int indexOfCombinedArray=0;

        for (; indexOfCombinedArray < combinedArray.length; indexOfCombinedArray ++){

           if(indexOfnum1 < nums1.length && indexOfnum2 < nums2.length){
               if(nums1[indexOfnum1] < nums2[indexOfnum2]){
                   combinedArray[indexOfCombinedArray] = nums1[indexOfnum1];
                   indexOfnum1++;
               }else {
                   combinedArray[indexOfCombinedArray]= nums2[indexOfnum2];
                   indexOfnum2++;
               }

           } else if (indexOfnum1 < nums1.length) {
               combinedArray[indexOfCombinedArray] = nums1[indexOfnum1];
               indexOfnum1++;
           }else {
               combinedArray[indexOfCombinedArray]= nums2[indexOfnum2];
               indexOfnum2++;
           }

        }
        return combinedArray;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] combinedArray ;

        if(nums1.length ==0 ){
            combinedArray = nums2;
        } else if (nums2.length ==0) {
            combinedArray = nums1;
        }else {
            combinedArray = combinedSort(nums1 , nums2);
        }

        System.out.println(Arrays.toString(combinedArray));

        int middle = combinedArray.length / 2;

        if(middle % 2 ==0  ){
            return (combinedArray[middle] + combinedArray[middle-1])/2.0;
        }else {
            return combinedArray[middle];
        }

    }


    public static void main(String[] args) {

        int[] num1 = {1,2};
        int[] num2 = {3,4};

        System.out.println(findMedianSortedArrays(num1 , num2));

    }
}
