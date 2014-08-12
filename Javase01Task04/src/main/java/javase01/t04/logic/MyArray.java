package javase01.t04.logic;

public class MyArray {
    private double [] array;

    public MyArray(double[] array){
        this.array = new double[array.length];
        for(int i = 0; i<array.length; i++){
            this.array[i]=array[i];
        }
    }
    public double[] getArray() {
        return array;
    }

    public static double[] generateArray(int halfSize, double maxValue) {
        double [] a = new double[halfSize*2];
        for (int i =0; i<a.length; i++){
            a[i]= Math.random()*(maxValue*2)-maxValue;
        }
        return a;
    }


    public double getElement(int i) throws Exception {
        if(i>=0) {
            return this.array[i];
        } else{
            throw new Exception("Size of array must be positive");
        }
    }

    public double findMaxSum(){
        double [] arrayWithSums = new double [this.array.length/2];
        for (int i = 0; i<arrayWithSums.length;i++){
            arrayWithSums[i]=this.array[i]+this.array[this.array.length-i-1];
        }
        double maxSum = arrayWithSums[0];
        for(int i = 0; i<arrayWithSums.length; i++){
            if(arrayWithSums[i]>maxSum){
                maxSum = arrayWithSums[i];
            }
        }
        return maxSum;
    }

}
