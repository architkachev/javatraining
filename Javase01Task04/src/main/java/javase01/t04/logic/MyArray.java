package javase01.t04.logic;

public class MyArray {
    private double [] array;
    private final double MAX_VALUE;
    public MyArray(int halfSize, double maxValue) {
        MAX_VALUE = maxValue;
        double [] a = new double[halfSize*2];
        for (int i =0; i<a.length; i++){
            a[i]= Math.random()*(MAX_VALUE*2)-MAX_VALUE;
        }
        this.array = a;
    }

    public void printArray(int scale){
        for(double i: this.array){
            System.out.print(String.format("%."+scale+"f",i)+" ");
        }
        System.out.println("");
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
