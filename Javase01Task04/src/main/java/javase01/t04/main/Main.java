package javase01.t04.main;

import javase01.t04.logic.MyArray;

public class Main {

    public static void main(String [] args){
        int scale = 4;
        if(args.length==1){
            try{
                int halfSize = Integer.parseInt(args[0]);
                MyArray myArray = new MyArray(MyArray.generateArray(halfSize, 1000));
                for (double d: myArray.getArray()){
                    System.out.print(String.format("%."+scale+"f",d)+" ");
                }
                System.out.println("");

                System.out.println("MaxSum: "+ String.format("%.4f", myArray.findMaxSum()));

            } catch (Exception e){
                System.out.println("Integer parameter!");
            }
        } else{
            System.out.println("Program must have 1 parameter N");
        }
    }
}
