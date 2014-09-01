package creators;

import java.io.File;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import plane.Airliner;
import plane.Airport;
import plane.Freighter;

public class XMLParser {
	
	private Airport airport;
	private LinkedList<Airliner> airliners;
	private LinkedList<Freighter> freighters;
	private Director director;

	public XMLParser(){
		airliners = new LinkedList<Airliner>();
		freighters = new LinkedList<Freighter>();
		airport = Airport.getAirportInstance();
	}
	
	public void parse() {

		String name = "";
		int maxHeight;
		int fuelConsumption;
		int range;
		int seating;
		int maxSpeed;
		int minSpeed;
		int capacity;

		try {
			File xmlFile = new File("src\\Airport.xml");
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document document = docBuilder.parse(xmlFile);
			document.getDocumentElement().normalize();
			
			NodeList nodeList = document.getElementsByTagName("buisness");
			director = new Director("buisness");
			for (int tmp = 0; tmp < nodeList.getLength(); tmp++) {
				Node node = nodeList.item(tmp);
				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;

					name = element.getElementsByTagName("name").item(0)
							.getChildNodes().item(0).getNodeValue();
					maxHeight = Integer.parseInt(element.getElementsByTagName("maxheight")
							.item(0).getChildNodes().item(0).getNodeValue());
					fuelConsumption = Integer.parseInt(element
							.getElementsByTagName("fuelconsumption").item(0)
							.getChildNodes().item(0).getNodeValue());
					range = Integer.parseInt(element
							.getElementsByTagName("range").item(0)
							.getChildNodes().item(0).getNodeValue());
					maxSpeed = Integer.parseInt(element
							.getElementsByTagName("maxspeed").item(0)
							.getChildNodes().item(0).getNodeValue());
					seating=Integer.parseInt(element
							.getElementsByTagName("seating").item(0)
							.getChildNodes().item(0).getNodeValue());
					
					airliners.add((Airliner) director.getPlane(name, maxHeight,fuelConsumption,range,seating,maxSpeed));
					
				}
			}

			nodeList = document.getElementsByTagName("economy");
			director = new Director("economy");
			for (int tmp = 0; tmp < nodeList.getLength(); tmp++) {
				Node node = nodeList.item(tmp);
				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;

					name = element.getElementsByTagName("name").item(0)
							.getChildNodes().item(0).getNodeValue();
					maxHeight = Integer.parseInt(element.getElementsByTagName("maxheight")
							.item(0).getChildNodes().item(0).getNodeValue());
					fuelConsumption = Integer.parseInt(element
							.getElementsByTagName("fuelconsumption").item(0)
							.getChildNodes().item(0).getNodeValue());
					range = Integer.parseInt(element
							.getElementsByTagName("range").item(0)
							.getChildNodes().item(0).getNodeValue());
					minSpeed = Integer.parseInt(element
							.getElementsByTagName("minspeed").item(0)
							.getChildNodes().item(0).getNodeValue());
					seating=Integer.parseInt(element
							.getElementsByTagName("seating").item(0)
							.getChildNodes().item(0).getNodeValue());
					
					airliners.add((Airliner) director.getPlane(name, maxHeight,fuelConsumption,range,seating,minSpeed));
				}
			}
			nodeList = document.getElementsByTagName("freighters");
			director = new Director("freighter");
			for (int tmp = 0; tmp < nodeList.getLength(); tmp++) {
				Node node = nodeList.item(tmp);
				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;

					name = element.getElementsByTagName("name").item(0)
							.getChildNodes().item(0).getNodeValue();
					maxHeight = Integer.parseInt(element.getElementsByTagName("maxheight")
							.item(0).getChildNodes().item(0).getNodeValue());
					fuelConsumption = Integer.parseInt(element
							.getElementsByTagName("fuelconsumption").item(0)
							.getChildNodes().item(0).getNodeValue());
					range = Integer.parseInt(element
							.getElementsByTagName("range").item(0)
							.getChildNodes().item(0).getNodeValue());
					
					capacity=Integer.parseInt(element
							.getElementsByTagName("capacity").item(0)
							.getChildNodes().item(0).getNodeValue());
					freighters.add((Freighter) director.getPlane(name, maxHeight, fuelConsumption, range, capacity));
					
				}
			}

			airport.setAirliners(airliners);
			airport.setFreighters(freighters);


		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
