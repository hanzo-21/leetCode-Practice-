package orgAayush.tests;

import junit.framework.TestCase;
import orgAayush.problems._1_twoSumProblem;

import static org.junit.Assert.assertArrayEquals;

public class _1_twosumproblemtest extends TestCase {

    _1_twoSumProblem twoSumProblem  = new _1_twoSumProblem();

    public void test1(){
        int[] expectedOutput = {0,1};
        int[] arrayInput = {2,7,11,15};
        int target = 9;

        int[] actualOutput = twoSumProblem.twoSum(arrayInput,target);

        assertArrayEquals(expectedOutput, actualOutput);

    }
    public void test2(){
        int[] arrayInput = {3,2,4};
        int target = 6;
        int[] expectedOutput = {1,2};


        int[] actualOutput = twoSumProblem.twoSum(arrayInput,target);

        assertArrayEquals(expectedOutput, actualOutput);

    }
    public void test3(){
        int[] arrayInput = {3,3};
        int target = 6;
        int[] expectedOutput = {0,1};

        int[] actualOutput = twoSumProblem.twoSum(arrayInput,target);

        assertArrayEquals(expectedOutput, actualOutput);

    }

}