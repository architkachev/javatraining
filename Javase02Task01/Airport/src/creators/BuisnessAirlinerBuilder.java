package creators;

import plane.BuisnessClassAirliner;
import plane.Plane;

public class BuisnessAirlinerBuilder extends AbstractBuilder {

	BuisnessClassAirliner plane;
	
	public BuisnessAirlinerBuilder(){
		plane = new BuisnessClassAirliner();
	}
	@Override
	public Plane getPlane(String name, int... args) {
		
		plane.setName(name);
		plane.setMaxHeight(args[0]);
		plane.setFuelConsumption(args[1]);
		plane.setRange(args[2]);
		plane.setSeating(args[3]);
		plane.setMaxSpeed(args[4]);
		return plane;
	}

}
