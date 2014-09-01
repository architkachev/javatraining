package plane;

public class BuisnessClassAirliner extends Airliner {

	private int maxSpeed;
	
	public BuisnessClassAirliner(String name, int maxHeight, int fuelConsumption,
									int range, int seating, int maxSpeed){
		super(name, maxHeight, fuelConsumption, range, seating);
		this.setMaxSpeed(maxSpeed);
	}
	
	public BuisnessClassAirliner() {}

	public void fly(){
		
	}
	
	public String toString(){
		
		StringBuilder builder = new StringBuilder();
		builder.append(" maxSpeed "+this.maxSpeed);
		return super.toString()+builder.toString();
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
