package orgAayush.tests;

import junit.framework.TestCase;
import orgAayush.problems._7_ReverseInteger;

public class _7_ReverseIntegerTest extends TestCase {

    _7_ReverseInteger ri = new _7_ReverseInteger();

    public void testLogic(){
        int x = Integer.MAX_VALUE;
        int y = Integer.MIN_VALUE;

        System.out.println();

        System.out.println(x*10);

        System.out.println(y+1);


        System.out.println(y-1);

    }

     public void test1(){
         int input = 123;
         int expectedOutput= 321;

         int actualOutput =ri.reverse(input);

         assertEquals(expectedOutput,actualOutput);
     }
    public void test2(){
        int input = -123;
        int expectedOutput= -321;

        int actualOutput =ri.reverse(input);

        assertEquals(expectedOutput,actualOutput);

    }
    public void test3(){
        int input = 120;
        int expectedOutput= 21;

        int actualOutput =ri.reverse(input);

        assertEquals(expectedOutput,actualOutput);

    }
    public void test4(){
        int input = 1534236469;
        int expectedOutput=0;

        int actualOutput =ri.reverse(input);

        assertEquals(expectedOutput,actualOutput);

    }

}