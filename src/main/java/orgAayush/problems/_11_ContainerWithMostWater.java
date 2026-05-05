package orgAayush.problems;

import javax.naming.LimitExceededException;

public class _11_ContainerWithMostWater {
    /*
    we need 2 pointes ,
    maxArea for volume comaparisn

    brute force , two loop throught each height and return the max area

    efficent ??

    how to for 1 loop

    re starting for ever time  a longer hright is discovered ?

    hints says to move with lover height when new max area is found

    when equal shiif the upper limit




     */

    public int getArea(int width , int heigh1 , int height2){
        return (heigh1<height2 ? width*heigh1 : width*height2);
    }

    public int maxArea(int[] height) {

        int max = -1;

        for (int lowerLimit = 0 , upperLimit = height.length-1; upperLimit >=0 ; ) {

            int temp =getArea(upperLimit-lowerLimit,height[upperLimit],height[lowerLimit] );

            if(temp > max){
                max = temp;

            }
            if ((lowerLimit != upperLimit) &&  (height[lowerLimit] < height[upperLimit]) ){
                lowerLimit++;

            } else {
                upperLimit--;
            }

        }


        return max;
    }
}
