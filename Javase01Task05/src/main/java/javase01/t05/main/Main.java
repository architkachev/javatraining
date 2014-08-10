package javase01.t05.main;

import javase01.t05.logic.Matrix;

public class Main {
    public static void main(String [] args){
        if(args.length==1){
            try{
                int n = Integer.parseInt(args[0]);
                Matrix matrix = new Matrix(n,n);
                matrix.setCrossX();
                for (int i =0; i< matrix.getHeight(); i++){
                    for(int j =0; j< matrix.getWidth(); j++){
                        System.out.print(matrix.getElement(i,j)+"\t");
                    }
                    System.out.println(" ");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else{
            System.out.println("Program must have 1 parameter N");
        }
    }
}
