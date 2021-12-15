package objects;

public class AirConditioner{
	private final String id;
	private double temp = 23;
	private double externalTemp = 23;
	private String mode;
	private double consumption;
	
	public AirConditioner(String id) {
		this.id = id;	
		this.mode="fan";
		this.consumption = 500.0;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getExternalTemp() {
		return externalTemp;
	}

	public void setExternalTemp(double externalTemp) {
		this.externalTemp = externalTemp;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public String getId() {
		return id;
	}	
}