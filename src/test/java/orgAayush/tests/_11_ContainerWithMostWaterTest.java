package orgAayush.tests;

import junit.framework.TestCase;
import orgAayush.problems._11_ContainerWithMostWater;

public class _11_ContainerWithMostWaterTest extends TestCase {

    _11_ContainerWithMostWater cwmw = new _11_ContainerWithMostWater();

    public  void  test1(){
        int[] input = {1,8,6,2,5,4,8,3,7};

        int expectedOutput = 49;

        int actualOutput = cwmw.maxArea(input);

        assertEquals(expectedOutput,actualOutput);

    }


    public  void  test2(){
        int[] input = {1,1};

        int expectedOutput = 1;

        int actualOutput = cwmw.maxArea(input);

        assertEquals(expectedOutput,actualOutput);

    }
    public  void  test3(){
        int[] input = {1,2,1};

        int expectedOutput = 2;

        int actualOutput = cwmw.maxArea(input);

        assertEquals(expectedOutput,actualOutput);

    }





}