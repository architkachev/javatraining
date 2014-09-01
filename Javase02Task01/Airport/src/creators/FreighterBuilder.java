package creators;

import plane.Freighter;


public class FreighterBuilder extends AbstractBuilder {

	Freighter plane;
	public FreighterBuilder(){
		plane = new Freighter();
	}

	@Override
	public Freighter getPlane(String name, int... args) {
		plane.setName(name);
		plane.setMaxHeight(args[0]);
		plane.setFuelConsumption(args[1]);
		plane.setRange(args[2]);
		plane.setCapacity(args[3]);
		return plane;
		
	}
	
	


	
}

	

