package javase01.t02.main;

import javase01.t02.logic.Sequence;

import java.math.BigDecimal;

//E enter as first parameter (epsilon) of application between 0 and 1
public class Main {
    public static void main(String [] args){
        if(args.length==1){
            if(args[0].matches("0\\.[\\d]+")){
                BigDecimal epsilon = new BigDecimal(args[0]);
                System.out.println("Epsilon:   " + epsilon.toString());
                Sequence s = new Sequence();
                System.out.println("Position: "+ s.positionOfElement(epsilon));
            } else {
                System.out.println("Parameter epsilon must be between 0 and 1, for example 0.0000022354556");
            }
        } else {
            System.out.println("Program must have only one parameter - epsilon");
        }
    }
}
