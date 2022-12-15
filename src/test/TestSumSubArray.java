package test;

import org.junit.Assert;
import org.junit.Test;

import main.SumSubArray;

public class TestSumSubArray {
    @Test
    public void testSumSubArray0(){
        //Given
        int[] sumSubArray={};
        //Then
        int expected= 0;
        SumSubArray sumSub = new SumSubArray();
        //When
        Assert.assertEquals(expected, sumSub.sumSubArray(sumSubArray));
    }
    @Test
    public void testSumSubArray1(){
        //Given
        int[] sumSubArray={1,2,3};
        //Then
        int expected= 20;
        SumSubArray sumSub = new SumSubArray();
        //When
        Assert.assertEquals(expected, sumSub.sumSubArray(sumSubArray));
    }
    @Test
    public void testSumSubArray2(){
        //Given
        int[] sumSubArray={1,2,3,4,5,6};
        //Then
        int expected= 196;
        SumSubArray sumSub = new SumSubArray();
        //When
        Assert.assertEquals(expected, sumSub.sumSubArray(sumSubArray));
    }
    @Test
    public void testSumSubArray3(){
        //Given
        int[] sumSubArray={-1,0,2};
        //Then
        int expected=3;
        SumSubArray sumSub = new SumSubArray();
        //When
        Assert.assertEquals(expected, sumSub.sumSubArray(sumSubArray));
    }

}
