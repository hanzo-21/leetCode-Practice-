package leetcodeModule;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    /*

    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }

        int lengthOfSubstring = 1;

        for (int i =0 ; i < s.length() ; i++){
            for (int j=i+2 ;j<s.length()+1; j ++ ){
                String subString = s.substring(i,j);

                int len =subString.length();

                boolean isQualifiedString = true;

                for (char currentCharacter : subString.toCharArray()){
                    int occurance  = len - subString.replace(String.valueOf(currentCharacter),"" ).length();

                    if(occurance >1 ){
                        isQualifiedString = false;
                        break;
                    }

                }

                if(isQualifiedString){

                    if(subString.length() >= 97){
                        return 97;
                    }

                    if(lengthOfSubstring <len){
                        System.out.println(subString);
                        System.out.println(lengthOfSubstring);
                        lengthOfSubstring = subString.length();
                    }

                }

            }

        }
        return  lengthOfSubstring;
    }
*/


    //trying reversing the order of substring



    /*
    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }

        int lengthOfSubstring = 1;

        for (int i =0 ; i < s.length()  ; i++){
            for (int j=s.length();j>i+1; j -- ){

                String subString = s.substring(i,j);

                System.out.println(subString);

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
                        lengthOfSubstring = subString.length();
                    }                }

            }

        }
        return  lengthOfSubstring;
    }



 */


    //  gave a performance of 5 ms and beats 85 % of people
    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }

        HashMap<Character , Integer> map = new HashMap<>();
        int max=0;
        char[] charArrayOfs = s.toCharArray();


        for (int lowerBound =0 , upperBound =0 ; upperBound< s.length() ;upperBound++){

            //check if upper bound character is in the window or not
           if((!map.containsKey(charArrayOfs[upperBound])) || (map.get(charArrayOfs[upperBound]) < lowerBound )) {
               int characterInsideWindow = upperBound - lowerBound +1;
               if(max < characterInsideWindow ){
                   max = characterInsideWindow;
               }
           }else {
               lowerBound = map.get(charArrayOfs[upperBound]) + 1;
           }
            map.put(charArrayOfs[upperBound], upperBound);


        }
        return max;
    }



    public static void main(String[] args) {

        //String word = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLXCVBNM[]{}|\\\",./<>? ";



        String word = "tmmzuxt";
        System.out.println(word.length());
        System.out.println(lengthOfLongestSubstring(word));

    }
}
