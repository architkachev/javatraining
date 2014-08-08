package javase01.t05.main;

import javase01.t05.logic.Matrix;

public class Main {
    public static void main(String [] args){
        if(args.length==1){
            try{
                int n = Integer.parseInt(args[0]);
                if(n>1){
                    Matrix matrix = new Matrix(n,n);
                    matrix.setKrestX();
                    matrix.printMatrix();
                } else {
                    System.out.println("Size of array must be positive and greater then 1.");
                }
            } catch (Exception e){
                System.out.println("Integer parameter!");
            }
        } else{
            System.out.println("Program must have 1 parameter N");
        }
    }
}
