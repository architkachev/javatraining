package javase01.t03.logic;

import java.util.ArrayList;

public class OurFunc {
    public static double getTan2xMinus3(double argument){
        return Math.tan(2*argument)-3;
    }

    public static ArrayList<double[]> getTable(double step, double beginArg, double endArg) throws Exception {
        if((beginArg<endArg)&&(step<(endArg-beginArg))) {
            ArrayList<double[]> table = new ArrayList<double[]>();
            for (double i = beginArg; i <= endArg; i += step) {
                table.add(new double[]{i, getTan2xMinus3(i)});
            }
            return table;
        } else {
            throw new Exception("Parameters are out of logic.");
        }
    }
}
