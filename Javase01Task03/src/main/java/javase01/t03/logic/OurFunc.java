package javase01.t03.logic;

public class OurFunc {
    public static double getValue(double argument){
        return Math.tan(2*argument)-3;
    }

    public void printTable(double step, double beginArg, double endArg){
        if((beginArg<endArg)&&(step<(endArg-beginArg))) {
            for (double i = beginArg; i <= endArg; i += step) {
                System.out.println("x= " + String.format("%.4f", i) + "\ty= " + String.format("%.4f", getValue(i)));
            }
        } else {
            System.out.println("There is no logic in this params. Cant build table.");
        }
    }
}
