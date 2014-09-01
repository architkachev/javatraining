package logic;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import plane.Airliner;
import plane.Freighter;

public class TreeSetWithComparator {

	private Comparator<Airliner> airlinerComparator;
	private Comparator<Freighter> freighterComparator;
	private Set<Airliner> airlinerSet;
	private Set<Freighter> freighterSet;
	
	public void sortAirliner(LinkedList<Airliner> airliners){
		
		airlinerComparator = new AirlinerRangeComparator();
		airlinerSet = new TreeSet<Airliner>(airlinerComparator);
		
		for (Airliner airliner : airliners){
			airlinerSet.add(airliner);
		}
		
		System.out.println("A sorted set of Airliners: ");
		
		for (Airliner airliner : airlinerSet){
			
			System.out.println("Name: "+airliner.getName()+" Range: "+airliner.getRange());
		}
		
	}
	
	public void sorFreighter(LinkedList<Freighter> freighters){
		
		freighterComparator = new FreighterRangeComparator();
		freighterSet = new TreeSet<Freighter>(freighterComparator);
		
		for(Freighter freighter: freighters){
			freighterSet.add(freighter);
		}
		
		System.out.println("A sorted set of Freighters: ");
		
		for (Freighter freighter: freighterSet){
			
			System.out.println("Name: "+freighter.getName()+" Range: "+freighter.getRange());
		}
		
	}
}
