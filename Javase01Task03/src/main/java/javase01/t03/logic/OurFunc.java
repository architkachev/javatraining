package javase01.t03.logic;

public class OurFunc {
    public static double getValue(double argument){
        return Math.tan(2*argument)-3;
    }

    public void printSteps(double step, double a, double b){
        for(double i = a; i<=b; i+=step){
            System.out.println("x= "+String.format("%.4f",i)+"\ty= "+String.format("%.4f",getValue(i)));
        }
    }
}
