package orgAayush.problems;

import java.util.Arrays;

public class _5_LongestPalindromicSubstring {




    public String longestPalindrome(String s) {

        if(s.length()<2){
            return s;
        }

        int low;
        int high;
        int[] largestRangeIndex= {0,0};
        char[] string = s.toCharArray();

        //for odd
        for (int  center = 1 ; center <string.length-1; center++) {
            low =center-1;
            high=center+1;

            while (low>=0 && high < string.length){
                if (string[low] != string[high]){
                    // is not a palindrome
                    break;
               }
                if (largestRangeIndex[1]-largestRangeIndex[0] < high-low){
                        largestRangeIndex= new int[]{low, high};
                }
                low--;
                high++;
            }

        }

        //for even

        for (int  center = 0 ; center <string.length-1; center++) {
            low =center;
            high=center+1;

            while (low>=0 && high < string.length){
                if (string[low] != string[high]){
                    // is not a palindrome
                    break;
                }
                if (largestRangeIndex[1]-largestRangeIndex[0] < high-low){
                    largestRangeIndex= new int[]{low, high};
                }
                low--;
                high++;
            }

        }


        return s.substring(largestRangeIndex[0],largestRangeIndex[1]+1);
    }


    /*


    public String longestPalindrome(String s) {

        for (int substringLength = s.length() ; substringLength > 0 ;substringLength--){
            for (int offset = 0; offset + substringLength<= s.length() ; offset++) {

                String tempSubstring = s.substring(offset,offset+substringLength);

                if(isPalindrome(tempSubstring)){
                    return tempSubstring;
                }

            }

        }

        return "0";
    }
     */

/*
    public String longestPalindrome(String s) {

        if(s.length() <=1 ){
            return s;
        }

        String maxSubString= s.substring(0,1);


        for (int lowLimit = 0; lowLimit < s.length() ; lowLimit++){

            for (int highLimit = s.length() ; highLimit - lowLimit > 1 ; highLimit--){
                String subString = s.substring(lowLimit,highLimit);

                if (isPalindrome(subString) && subString.length() > maxSubString.length() ){
                    maxSubString = subString;

                }
            }
        }

        return maxSubString;
    }
    */




}




