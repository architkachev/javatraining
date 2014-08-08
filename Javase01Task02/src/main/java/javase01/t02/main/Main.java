package javase01.t02.main;

import javase01.t02.logic.Sequence;
import java.math.BigDecimal;

//E enter as first parameter (epsilon) of application between 0 and 1
// good example epsilon = 0.0100000000000000000000000000000000000000000000000000001
public class Main {
    public static void main(String [] args){
        if(args.length==1){
            BigDecimal epsilon = new BigDecimal(args[0]);
            System.out.println("Epsilon:   " + epsilon.toString());
            Sequence s = new Sequence();

            try {
                int pos = s.getPositionOfElement(epsilon);
                System.out.println("Position: " + pos);
                for (BigDecimal bd: s.getListOfElements(pos)){
                    System.out.println(bd);
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("Program must have one parameter - epsilon");
        }
    }
}
