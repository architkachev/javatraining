package javase01.t02.logic;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Sequence {
    private final int SCALE;

    public Sequence(int SCALE) {
        this.SCALE = SCALE;
    }

    public Sequence() {
        this.SCALE = 50;
    }

    public BigDecimal getElement(BigInteger position){
       BigDecimal positionDec = new BigDecimal(position);
       BigDecimal incPositionDec = positionDec.add(BigDecimal.ONE);
       BigDecimal quotient = (BigDecimal.ONE).divide(incPositionDec, this.SCALE, RoundingMode.CEILING);
       return quotient.pow(2);
    }

    public BigInteger positionOfElement(BigDecimal epsilon){
        BigInteger index = BigInteger.ONE;
        while(true){
            BigDecimal element = this.getElement(index);
            System.out.println(element.toString());
            if (epsilon.compareTo(element)==1){
                return index;
            }
            index = index.add(BigInteger.ONE);
        }
    }
}
