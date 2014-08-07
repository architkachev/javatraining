package javase01.t03.main;

import javase01.t03.logic.OurFunc;
//1st param STEP
//2nd param A
//3nd param B
public class Main {
    public static void main(String [] args){
        if(args.length==3){
            try{
                double step = Double.parseDouble(args[0]);
                double a = Double.parseDouble(args[1]);
                double b = Double.parseDouble(args[2]);
                OurFunc ourFunc = new OurFunc();
                ourFunc.printTable(step, a, b);
            } catch (Exception e){
                System.out.println("Params must be double");
            }
        } else{
            System.out.println("Program must have 3 parameters");
        }



    }
}
