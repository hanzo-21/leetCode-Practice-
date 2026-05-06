package orgAayush.problems;


public class _12_IntegerToRoman  {
    public String intToRoman(int num) {

        int[] numbers= {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        String[] romanEqv = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        String result = "";

        for (int i = numbers.length -1; num > 0 ; i--) {
            if (num >= numbers[i]){
                result = result.concat(romanEqv[i]);
                num = num - numbers[i];
                i++;
            }
        }


        return result;


    }
}
