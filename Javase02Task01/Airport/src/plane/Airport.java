package plane;

import java.util.LinkedList;


public class Airport {

		private LinkedList<Airliner> airliners;
		private LinkedList<Freighter> freighters;
		private static Airport instance;
		
		
		public static synchronized Airport getAirportInstance() {
			if (instance == null) {
				instance = new Airport();
			}
			return instance;

		}
		
		private Airport(){
			
		}

		public LinkedList<Freighter> getFreighters() {
			return freighters;
		}

		public void setFreighters(LinkedList<Freighter> freighters) {
			this.freighters = freighters;
		}

		public LinkedList<Airliner> getAirliners() {
			return airliners;
		}

		public void setAirliners(LinkedList<Airliner> airliners) {
			this.airliners = airliners;
		}
		
}
