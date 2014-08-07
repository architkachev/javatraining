package javase01.t04.logic;

public class MyArray {
    int [] array;
    public MyArray(int n) {
        int [] a = new int[n*2];
        for (int i =0; i<n*2; i++){
            a[i]= (int)(Math.random()*1000);
        }
        this.array = a;
    }

    public void printArray(){
        for(int i: this.array){
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public int findMaxSum(){
        int [] arrayWithSums = new int [this.array.length/2];
        for (int i = 0; i<arrayWithSums.length;i++){
            arrayWithSums[i]=this.array[i]+this.array[this.array.length-i-1];
        }
        int maxSum = arrayWithSums[0];
        for(int i = 0; i<arrayWithSums.length; i++){
            if(arrayWithSums[i]>maxSum){
                maxSum = arrayWithSums[i];
            }
        }
        return maxSum;
    }

}
