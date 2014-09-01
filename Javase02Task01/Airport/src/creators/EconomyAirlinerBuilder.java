package creators;

import plane.EconomyClassAirliner;
import plane.Plane;

public class EconomyAirlinerBuilder extends AbstractBuilder {

	EconomyClassAirliner plane;
	
	public EconomyAirlinerBuilder(){
		plane = new EconomyClassAirliner();
	}
	@Override
	public Plane getPlane(String name, int... args) {
		
		plane.setName(name);
		plane.setMaxHeight(args[0]);
		plane.setFuelConsumption(args[1]);
		plane.setRange(args[2]);
		plane.setSeating(args[3]);
		plane.setMinSpeed(args[4]);
		return plane;
	}

}
