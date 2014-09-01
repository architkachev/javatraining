package plane;
import org.apache.log4j.*;

public class Airliner extends Plane {

	String nameFile;
		
	protected int seating;
	
	public Airliner(){}
	
	public Airliner (String name, int maxHeight, int fuelConsumption,
						int range, int seating){
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
		this.seating=seating;
		this.fuelConsumption=fuelConsumption;
		this.range = range;
		
		
		
	}
	
	public void fly() {
		
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(" Seating "+this.seating);
		return super.toString()+builder.toString();
	}

	public int getSeating() {
		return seating;
	}

	public void setSeating(int seating) {
		this.seating = seating;
	}

}
