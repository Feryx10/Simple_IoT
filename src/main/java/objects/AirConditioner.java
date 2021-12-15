package objects;

public class AirConditioner implements Device{
	private final int id;
	private final String brand;
	private String buildingName;
	private float temp = 23;
	private float externalTemp;
	private String mode;
	private double consumption;
	
	public AirConditioner(int id, String brand, String building, double consumption) {
		super();
		this.id = id;
		this.brand = brand;
		this.buildingName = building;		
		this.consumption = consumption;
	}	
	
	@Override
	public int getID() {
		return id;
	}
	
	@Override
	public String getBuilding() {
		return buildingName;
	}
	
	@Override
	public void setBuilding(String building) {
		this.buildingName = building;
	}

	@Override
	public void setStandBy(boolean on) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStatus() {
		return "";		
	}

	public String getBrand() {
		return brand;
	}
	
	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getExternalTemp() {
		return externalTemp;
	}

	public void setExternalTemp(float externalTemp) {
		this.externalTemp = externalTemp;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getId() {
		return id;
	}

	public double getConsumption() {
		return this.consumption;
	}

}