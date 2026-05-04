package orgAayush.tests;

import junit.framework.TestCase;
import org.junit.Test;
import orgAayush.problems._10_RegularExpressionMatching;


public class _10_RegularExpressionMatchingTest extends TestCase {

    _10_RegularExpressionMatching rem = new _10_RegularExpressionMatching();



    public void test1(){
        String word = "aa";
        String pattern = "a";

        boolean expectedOutput = false;

        boolean actualOutput = rem.isMatch(word , pattern) ;

        assertEquals(expectedOutput,actualOutput);
    }


    public void test2(){
        String word = "aa";
        String pattern = "a*";

        boolean expectedOutput =  true;

        boolean actualOutput = rem.isMatch(word , pattern) ;

        assertEquals(expectedOutput,actualOutput);
    }


    public void test3(){
        String word = "ab";
        String pattern = ".*";

        boolean expectedOutput = true;

        boolean actualOutput = rem.isMatch(word , pattern) ;

        assertEquals(expectedOutput,actualOutput);
    }








}
