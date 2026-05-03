package orgAayush.tests;

import junit.framework.TestCase;
import orgAayush.problems._8_StringtoInteger_atoi;

public class _8_StringtoInteger_atoiTest extends TestCase {

    _8_StringtoInteger_atoi atio = new _8_StringtoInteger_atoi();

    public void testLogic1(){

        String word= "0023";

        int num = Integer.parseInt(word);

        System.out.println(num);

    }

    public void testLogic2(){


        System.out.println(Integer.MIN_VALUE  + " " + Integer.MIN_VALUE%10);


    }


    public void testLogic3(){
        String digits = "1234567890";
        String number ="4";

        System.out.println(digits.contains(number));


    }


    public void test1(){
        String input = "42" ;

        int expectedOutput = 42;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput,actualOutput);

    }

    public void test2(){
        String input = " -042" ;

        int expectedOutput = -42;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput,actualOutput);


    }

    public void test3(){
        String input = "1337c0d3" ;

        int expectedOutput = 1337;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput,actualOutput);

    }
    public void test4(){
        String input = "0-1" ;

        int expectedOutput = 0;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput,actualOutput);

    }

    public void test5(){
        String input = "words and 987" ;

        int expectedOutput = 0 ;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput,actualOutput);

    }

    public void test6(){
        String input = "-91283472332" ;

        int expectedOutput = -2147483648 ;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput,actualOutput);

    }

    public void test7(){
        String input = "  0000000000012345678" ;

        int expectedOutput = 12345678 ;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput,actualOutput);

    }

    public void test8() {
        String input = " ";

        int expectedOutput = 0;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput, actualOutput);
    }

    public void test9() {
        String input = "4193 with words";

        int expectedOutput = 4193;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput, actualOutput);
    }

    public void test10() {
        String input = "-2147483647";

        int expectedOutput = -2147483647;

        int actualOutput = atio.myAtoi(input);

        assertEquals(expectedOutput, actualOutput);
    }



}