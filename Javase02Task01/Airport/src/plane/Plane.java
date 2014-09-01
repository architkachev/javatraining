package plane;

public abstract class Plane {
	
	protected String name;
	protected int maxHeight;
	protected int fuelConsumption;
	protected int range;
	
	
	public abstract void fly();

	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		builder.append("Name "+this.name+" MaxHeight "+ this.maxHeight+
						" Fuel Consumption "+this.fuelConsumption+" Range "+this.range);
		
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Plane plane = (Plane)obj;
        return (maxHeight == plane.getMaxHeight());
	}
	
	@Override
	public int hashCode(){
		int code = 11;
	    int k = 7;
	    code = k*code + maxHeight;
	    code = k*code + name.hashCode();
	    return code;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaxHeight() {
		return maxHeight;
	}


	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}


	public int getFuelConsumption() {
		return fuelConsumption;
	}


	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}
}
