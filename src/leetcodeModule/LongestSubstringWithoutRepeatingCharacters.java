package leetcodeModule;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    

    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }

        int lengthOfSubstring = 1;

        for (int i =0 ; i < s.length() ; i++){
            for (int j=i+2 ;j<s.length()+1; j ++ ){
                String subString = s.substring(i,j);

                boolean isQualifiedString = true;

                for (char currentCharacter : subString.toCharArray()){
                    int occurance  = subString.length() - subString.replace(String.valueOf(currentCharacter),"" ).length();

                    if(occurance >1 ){
                        isQualifiedString = false;
                        break;
                    }

                }

                if(isQualifiedString){

                    if(lengthOfSubstring < subString.length()){
                        System.out.println(subString);
                        System.out.println(lengthOfSubstring);
                        lengthOfSubstring = subString.length();
                    }

                }

            }

        }
        return  lengthOfSubstring;
    }







    public static void main(String[] args) {

        String word = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ ";

        System.out.println(word.length());
        System.out.println(lengthOfLongestSubstring(word));

    }
}
