package orgAayush.tests;

import junit.framework.TestCase;
import org.junit.Test;
import orgAayush.problems._3_LongestSubstringWithoutRepeatingCharacters;

public class _3_LongestSubstringWithoutRepeatingCharactersTest extends TestCase {
    _3_LongestSubstringWithoutRepeatingCharacters larc  = new
            _3_LongestSubstringWithoutRepeatingCharacters();

    public void test1(){
        String inputString = "abcabcbb";
        int expectedOutput = 3;

        int actualOutput = larc.lengthOfLongestSubstring(inputString);

        assertEquals(expectedOutput,actualOutput);
    }


    public void test2(){
        String inputString = "bbbbb";
        int expectedOutput =1 ;

        int actualOutput = larc.lengthOfLongestSubstring(inputString);

        assertEquals(expectedOutput,actualOutput);
    }


    public void test3(){
        String inputString = "pwwkew";
        int expectedOutput = 3;

        int actualOutput = larc.lengthOfLongestSubstring(inputString);

        assertEquals(expectedOutput,actualOutput);
    }


}