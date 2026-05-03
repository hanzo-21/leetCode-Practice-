package orgAayush.problems;

import java.util.Arrays;
import java.util.Objects;

public class _8_StringtoInteger_atoi
{

    /*
            0. delete any white space
            1:determine sign
            2: loop for unit a non digit  character is encounterd
            3: in each loop check if round off occures and when return respecrive  overflow value
            4:


*/
/*

    public int myAtoi(String s) {

        if(s.isEmpty()){
            return 0;
        }
        String[] arrayString = s.split("");

        for (int i =0 ;i < arrayString.length;i++){

            if(Objects.equals(arrayString[i]," ")){
                s =s.substring(1);
            }else {
                break;
            }

        }

        if(s.isEmpty()){
            return 0;
        }

        String signSupport = s.substring(0,1);

        boolean isPositive = true;

        if(signSupport.equals("-")){
            s = s.substring(1);
            isPositive =false;
        } else if (signSupport.equals("+")) {
            s =s.substring(1);
        }

        String[] strArray = s.split("");
        String digits = "1234567890";
        String number ="";
        for(String strChar : strArray){
            if(digits.contains(strChar)){
                number = number.concat(strChar);

            }else {
                break;
            }

        }


        //removing leding zeros

        int zeroIndex= 0 ;
        String[] digitArryaString = number.split("");

        for (; zeroIndex < digitArryaString.length  ;zeroIndex++){
            if(Objects.equals(digitArryaString[zeroIndex] , "0")){
                number = number.substring(1);
            }else {
                break;
            }

        }


        //not i have a max 10 digit number
        //when when i have less than 10 convers and return it
        //when it is 10 get 9 digit ( 9 > max and is positive or 9 = 9max and lastidigit> lastdgitmax and iis potive
        // ) return int max
        //same with  min context

        if (number.length()>=11){
            if (isPositive){
                return Integer.MAX_VALUE ;
            }
            else {
                return Integer.MIN_VALUE;
            }
        }
        else if(number.length() == 10){
            //edeg case
            int topDigit = Integer.parseInt(number.substring(0,9));
            int lastDigit = Integer.parseInt(number.substring(9,10));

            if(topDigit < Integer.MAX_VALUE/10){
                if (isPositive){
                    return Integer.parseInt(number) ;
                }
                else {
                    return Integer.parseInt(number) *-1 ;
                }
            } else if (topDigit > Integer.MAX_VALUE/10) {
                if (isPositive){
                    return Integer.MAX_VALUE ;
                }
                else {
                    return Integer.MIN_VALUE;
                }
                
            }else {
                if (isPositive){

                    if(lastDigit > Integer.MAX_VALUE%10 ){
                        return Integer.MAX_VALUE;
                    }else {

                        return Integer.parseInt(number) ;
                    }

                }
                else {
                    if(lastDigit > (Integer.MAX_VALUE%10) +1 ){
                        return Integer.MIN_VALUE;
                    }else {

                        return Integer.parseInt(number) *-1;
                    }
                }
            }


        }
        else if (number.isEmpty()) {

            return 0;
        }
        else {
            if (isPositive){
                return Integer.parseInt(number) ;
            }
            else {
                return Integer.parseInt(number) *-1 ;
            }

        }

    }
    */

    public int myAtoi(String s) {
        int i = 0, n = s.length();

        // 1. Skip whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        int result = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Handle overflow BEFORE adding digit
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
