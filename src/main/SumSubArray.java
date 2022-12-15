package main;

import java.util.Arrays;

public class SumSubArray {
    //This method will return all the possibilities of subArray in an Array
    public int sumSubArray(int[] intArr){

        int sum =0;

        for(int i=0; i<intArr.length; i++){
            int[] newArr = Arrays.copyOfRange(intArr,i,intArr.length);
            int count = newArr.length;
            for(int j=0; j<newArr.length; j++){
                sum+= newArr[j]*count;
                count--;
            }
        }
        return sum;
    }
}
