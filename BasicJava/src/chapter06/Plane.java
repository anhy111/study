package chapter06;

public class Plane {
	
	//필드
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	
	//생성자
	public Plane() {
		numberOfPlanes++;
	}
	
	public Plane(String manufacturer, String model,
						int maxNumberOfPassengers) {
		this();
		setManufacturer(manufacturer);
		setModel(model);
		setMaxNumberOfPassengers(maxNumberOfPassengers);
	}
	
	
	//메서드
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers > 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
	public String toString() {
		return String.format("제조사: %s\n모델명: %s\n최대 승객수: %s"
				,manufacturer, model, maxNumberOfPassengers);
	}
}
