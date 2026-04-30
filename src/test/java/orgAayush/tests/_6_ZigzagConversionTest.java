package orgAayush.tests;

import junit.framework.TestCase;
import orgAayush.problems._6_ZigzagConversion;

public class _6_ZigzagConversionTest extends TestCase {

    _6_ZigzagConversion zc = new _6_ZigzagConversion();


    public void test1(){
       String input= "PAYPALISHIRING";
       int numRows = 3;

       String expectedOutput = "PAHNAPLSIIGYIR";

       String actualOutput = zc.convert(input,numRows);

       assertEquals(expectedOutput,actualOutput);

    }


    public void test2(){
        String input= "PAYPALISHIRING";
        int numRows = 4;

        String expectedOutput = "PINALSIGYAHRPI";

        String actualOutput = zc.convert(input,numRows);

        assertEquals(expectedOutput,actualOutput);

    }


    public void test3(){
        String input= "A";
        int numRows = 1;

        String expectedOutput = "A";

        String actualOutput = zc.convert(input,numRows);

        assertEquals(expectedOutput,actualOutput);

    }

    public void test4(){
        String input= "A";
        int numRows = 2;

        String expectedOutput = "A";

        String actualOutput = zc.convert(input,numRows);

        assertEquals(expectedOutput,actualOutput);

    }

    public void test5(){
        String input= "AB";
        int numRows = 1;

        String expectedOutput = "AB";

        String actualOutput = zc.convert(input,numRows);

        assertEquals(expectedOutput,actualOutput);

    }
}