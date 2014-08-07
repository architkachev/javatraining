package javase01.t02.logic;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Sequence {
    public static BigDecimal getIElement(BigInteger i){
       BigDecimal iter = new BigDecimal(i);
       BigDecimal iterInc = iter.add(BigDecimal.ONE);
       BigDecimal chastnoe = (BigDecimal.ONE).divide(iterInc,100, RoundingMode.CEILING);
       BigDecimal element = chastnoe.pow(2);
       return element;
    }

    public BigInteger positionOfElement(BigDecimal epsilon){
        //int i = 0;
        BigInteger ind = new BigInteger(String.valueOf(0));
        while(true){
            BigDecimal bd = getIElement(ind);
            ind = ind.add(BigInteger.ONE);
            System.out.println(bd.toString());
            if (epsilon.compareTo(bd)==1){
                return ind ;
            }
        }
    }
}
