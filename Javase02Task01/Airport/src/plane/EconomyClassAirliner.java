package plane;

public class EconomyClassAirliner extends Airliner {

	private int minSpeed;
	
	public EconomyClassAirliner(String name, int maxHeight, int fuelConsumption,
									int range, int seating, int minSpeed){
		super(name, maxHeight, fuelConsumption, range, seating);
		this.minSpeed=minSpeed;
	}
	
	public EconomyClassAirliner() {	}

	public void fly(){
		
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(" minSpeed "+this.minSpeed);
		return super.toString()+builder.toString();
	}

	public int getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
}
