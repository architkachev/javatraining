package creators;

import plane.Plane;

public class Director {
	private AbstractBuilder builder;
	
	public Director(String plane){
		if (plane.equals("freighter")){
			builder = new FreighterBuilder();			
		} else if (plane.equals("buisness")){
			builder = new BuisnessAirlinerBuilder();
		} else if (plane.equals("economy")){
			builder = new EconomyAirlinerBuilder();
		} else {
			throw new IllegalArgumentException();
		}
		
	}
	
	public Plane getPlane(String name, int...args){
		
		return builder.getPlane(name, args);
	}
}
