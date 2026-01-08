package leetcodeModule;

import java.util.Arrays;

public class MedianOfTwoSortedArrays_optimalApproach {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

       int numberOfItteraition =( nums1.length + nums2.length)/2 +1;
       int indexNum1 = 0 , indexNum2 = 0;

       int middleNum = -1 , nextMiddleNum = -1;

       for (int i =0 ; i < numberOfItteraition; i++){

           nextMiddleNum  = middleNum ;

           if(indexNum1 < nums1.length && indexNum2 < nums2.length){

               middleNum = (nums1[indexNum1] < nums2[indexNum2] ? nums1[indexNum1++]: nums2[indexNum2++]);
               
           } else if (indexNum1 < nums1.length) {
               middleNum = nums1[indexNum1++];
           }else {
               middleNum = nums2[indexNum2++];
           }

       }

       int totalLength = nums1.length + nums2.length;

       if(totalLength %2 == 0){
           return (middleNum + nextMiddleNum)/2.0;
       }else {
           return middleNum *1.0;
       }
    }


    public static void main(String[] args) {

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {6,7,8,9,10,11,12,13,14,15,16,17};

        System.out.println(findMedianSortedArrays(num1 , num2));

    }
}
