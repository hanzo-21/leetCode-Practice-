package orgAayush.problems;

public class _6_ZigzagConversion {
/*
    public String convert(String s, int numRows) {
        if(numRows >= s.length()){
            return s;
        }

        int dipOffset = (numRows>2 ? 2*numRows -2 : numRows);
        int riseOffset = 0;
        String[] string = s.split("");
        String resultString= "";

        for (int i = 0; i < numRows ; i++){

            resultString  =resultString.concat(string[i]);

            for (int j = i;;) {

                j = j + dipOffset;

                if (j >= string.length) {
                    break;
                } else if (dipOffset <= 0) {
                    resultString = resultString.concat("");
                } else {
                    resultString = resultString.concat(string[j]);
                }


                j = j + riseOffset;

                if (j >= string.length) {
                    break;
                } else if (riseOffset <= 0) {
                    resultString = resultString.concat("");
                } else {
                    resultString = resultString.concat(string[j]);
                }
            }
            dipOffset = dipOffset-2;
            riseOffset = riseOffset+2;

        }

        return resultString;
    }
    */


    public String convert(String s, int numRows) {
        if(numRows<=1 || numRows >= s.length()){
            return s;
        }

        String[] rows = new String[numRows];
        java.util.Arrays.fill(rows, ""); // Sets every element to an empty string instead of null


        boolean goingDown = true;
        int rowIndex = 0;

        String[] string = s.split("");


        for (int i = 0; i < s.length(); i++) {
            rows[rowIndex] =rows[rowIndex].concat(string[i]);

            if(goingDown){
                rowIndex++;
            }else {
                rowIndex--;
            }

            if (rowIndex>=numRows){
                rowIndex = rowIndex-2;
                goingDown =false;
            } else if (rowIndex < 0) {
                rowIndex= rowIndex+2;
                goingDown = true;
            }

        }

        String result = "";

        for (String rowString : rows){
            result = result.concat(rowString);
        }

        return result;
    }

}
