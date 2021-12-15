package objects;

public class Lights implements Device{
	private final int id;
	private final String brand;
	private String buildingName;
	private boolean mode;
	private final double consumption;	

	public Lights(int id, String brand, String buildingName, boolean mode, double consumption) {		
		this.id = id;
		this.brand = brand;
		this.buildingName = buildingName;
		this.mode = mode;
		this.consumption = consumption;
	}

	@Override
	public int getID() {		
		return this.id;
	}

	@Override
	public String getBuilding() {
		// TODO Auto-generated method stub
		return this.buildingName;
	}

	@Override
	public void setBuilding(String building) {
		this.buildingName = building;
	}

	@Override
	public void setStandBy(boolean mode) {
		this.mode = mode;
	}

	@Override
	public String getStatus() {
		return "";		
	}

	public double getConsumption() {
		return consumption;
	}	

}