package main;

public class SumSubArray {
    //This method will return all the possibilities of subArray in an Array
    public int sumSubArray(int[] intArr){
        intArr= new int[]{1, 2};
        int sum =0;
        for(int i=0; i<intArr.length; i++){
            for(int j=intArr.length-i-1;j>= 0; j--){
                sum+=intArr[j];
            }
        }
        System.out.println(sum);
        return sum;
    }
}
