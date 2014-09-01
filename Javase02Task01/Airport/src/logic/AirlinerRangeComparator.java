package logic;

import java.util.Comparator;

import plane.Airliner;

public class AirlinerRangeComparator implements Comparator<Airliner> {

	@Override
	public int compare(Airliner o1, Airliner o2) {
		int range1 = o1.getRange();
		int range2 = o2.getRange();
		
		if (range1<range2){
			return -1;
		} else if (range1==range2){
			return 0;
		} else {
			return 1;
		}	
	}

}
