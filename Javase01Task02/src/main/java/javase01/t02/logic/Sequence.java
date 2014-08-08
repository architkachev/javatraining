package javase01.t02.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class Sequence {
    private final int SCALE;

    public Sequence(int scale) throws Exception {
        if((scale>0)&&(scale<500)){
            this.SCALE = scale;
        } else{
            throw new Exception("Scale must be in interval (0,500)");
        }
    }

    public Sequence() {
        this.SCALE = 50;
    }

    public BigDecimal getElement(int position) throws Exception {
       if(position>0){
           BigDecimal positionDec = new BigDecimal(position);
           BigDecimal incPositionDec = positionDec.add(BigDecimal.ONE);
           BigDecimal quotient = (BigDecimal.ONE).divide(incPositionDec, this.SCALE, RoundingMode.CEILING);
           return quotient.pow(2);
       } else{
            throw new Exception("Index must be positive");
       }
    }

    public int getPositionOfElement(BigDecimal epsilon) throws Exception {
        if(epsilon.toString().matches("0\\.[\\d]+")){
            int index = 1;
            while(true){
                BigDecimal element = this.getElement(index);
                if (epsilon.compareTo(element)==1){
                    return index;
                }
                index++;
            }
        } else{
            throw new Exception("Parameter epsilon must be between 0 and 1, for example 0.0000022354556");
        }
    }
    public ArrayList<BigDecimal> getListOfElements(int numberOfElements) throws Exception {
        ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();
        for(int i =1; i<numberOfElements+1; i++){
                list.add(this.getElement(i));
        }
        return list;
    }
}
