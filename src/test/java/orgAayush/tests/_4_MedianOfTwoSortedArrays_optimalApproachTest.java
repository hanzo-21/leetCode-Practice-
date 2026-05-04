package orgAayush.tests;

import junit.framework.TestCase;
import orgAayush.problems._4_MedianOfTwoSortedArrays_optimalApproach;

public class _4_MedianOfTwoSortedArrays_optimalApproachTest extends TestCase {

    _4_MedianOfTwoSortedArrays_optimalApproach m2sa =new _4_MedianOfTwoSortedArrays_optimalApproach();

    public  void  test1(){
        int[] num1 = {1,3};
        int[] num2 = {2};
        double expectedOutput = 2.00;

        double actualOutput = m2sa.findMedianSortedArrays(num1,num2);

        assertEquals(expectedOutput,actualOutput);

    }

    public  void  test2(){
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        double expectedOutput = 2.50;

        double actualOutput = m2sa.findMedianSortedArrays(num1,num2);

        assertEquals(expectedOutput,actualOutput);

    }

    public  void  test3(){
        int[] num1 = {1,2,3,4,5,6};
        int[] num2 = {4,5,6,7,8};
        double expectedOutput =5.0;

        double actualOutput = m2sa.findMedianSortedArrays(num1,num2);

        assertEquals(expectedOutput,actualOutput);

    }

    public  void  test4(){
        int[] num1 = {1, 2, 3, 4, 5, 6};
        int[] num2 = {};
        double expectedOutput = 3.5;

        double actualOutput = m2sa.findMedianSortedArrays(num1,num2);

        assertEquals(expectedOutput,actualOutput);

    }

}