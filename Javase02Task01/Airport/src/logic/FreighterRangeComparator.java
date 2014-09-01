package logic;

import java.util.Comparator;

import plane.Freighter;

public class FreighterRangeComparator implements Comparator<Freighter> {

	@Override
	public int compare(Freighter o1, Freighter o2) {
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
