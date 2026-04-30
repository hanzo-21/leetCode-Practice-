package orgAayush.problems;

public class _4_MedianOfTwoSortedArrays_optimalApproach {


    public  double findMedianSortedArrays(int[] nums1, int[] nums2) {

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

}
