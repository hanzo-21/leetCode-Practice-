package orgAayush.problems;

public class _7_ReverseInteger {
    public int reverse(int x) {

         int result = 0;

        while (x!=0){

            int lastDigit = x%10;
            //for +ve end
            if(result > Integer.MAX_VALUE/10 || (result== Integer.MAX_VALUE/10 && lastDigit >= Integer.MAX_VALUE%10)  ){
                return 0;

            }

            if(result < Integer.MIN_VALUE/10 ||(result== Integer.MIN_VALUE/10 && lastDigit <= Integer.MIN_VALUE%10)  ){
                return 0;

            }


            result = result *10 + lastDigit;
            x=x/10;
        }

        return result;
    }
}

