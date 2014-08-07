package javase01.t04.main;

import javase01.t04.logic.MyArray;

public class Main {
    public static void main(String [] args){
        if(args.length==1){
            try{
                int n = Integer.parseInt(args[0]);
                MyArray myArray = new MyArray(n);
                myArray.printArray();
                System.out.println("MaxSum: "+ myArray.findMaxSum());
            } catch (Exception e){
                System.out.println("Integer parameter!");
            }
        } else{
            System.out.println("Program must have 1 parameter N");
        }
    }
}
