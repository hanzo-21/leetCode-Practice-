package orgAayush.tests;

import junit.framework.TestCase;
import orgAayush.problems._12_IntegerToRoman;

public class _12_IntegerToRomanTest extends TestCase {

    _12_IntegerToRoman itr = new _12_IntegerToRoman();


    public void test1(){
        int input = 3749;

        String expectedOutput = "MMMDCCXLIX";

        String actualOutput =itr.intToRoman(input);

        assertEquals(expectedOutput,actualOutput);
    }


    public void test2(){
        int input = 58;

        String expectedOutput = "LVIII";

        String actualOutput =itr.intToRoman(input);

        assertEquals(expectedOutput,actualOutput);
    }


    public void test3(){
        int input = 1994;

        String expectedOutput = "MCMXCIV";

        String actualOutput =itr.intToRoman(input);

        assertEquals(expectedOutput,actualOutput);
    }

}