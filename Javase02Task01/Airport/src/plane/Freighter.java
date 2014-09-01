package plane;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Freighter extends Plane {

	String nameFile;
	
	private int capacity;
	
	public Freighter(){}
	
	public Freighter(String name, int maxHeight,int fuelConsumption,
						int range, int capacity){
		
		nameFile="Log4j.properties";
		PropertyConfigurator.configure(nameFile);
		
		
		try{
			
			if (maxHeight<=0){
				throw new Exception("Ellegal argument");
			}
			
		}catch (Exception e){
			Logger.getLogger(e.getClass()).log(Level.ERROR, "Catched!",e);
		}
		this.name=name;
		this.maxHeight=maxHeight;
		this.capacity=capacity;
		this.fuelConsumption=fuelConsumption;
		this.range = range;
	}
	
	public void fly() {
	
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(" Seating "+this.capacity);
		return super.toString()+builder.toString();
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
