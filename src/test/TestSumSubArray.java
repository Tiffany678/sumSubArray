package test;

import org.junit.Assert;
import org.junit.Test;

import main.SumSubArray;

public class TestSumSubArray {
    @Test
    public void testSumSubArray1(){
        //Given
        int[] sumSubArray={1,2};
        //Then
        int expected= 5;
        SumSubArray sumSub = new SumSubArray();
        //When
        Assert.assertEquals(expected, sumSub.sumSubArray(sumSubArray));
    }

}
