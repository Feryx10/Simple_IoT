package objects;

public class AirConditioner{
	private final String id;
	private int temp = 23;
	private int externalTemp = 23;
	private String mode;
	private int consumption;
	
	public AirConditioner(String id) {
		this.id = id;	
		this.mode="Off";
		this.consumption = 500;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getExternalTemp() {
		return externalTemp;
	}

	public void setExternalTemp(int externalTemp) {
		this.externalTemp = externalTemp;
	}

	public String getMode() {
		return mode;
	}
	
	public int getIntMode() {
		switch (this.getMode()) { 
			case "Off":			
				return 0;			
			case "Hot":
				return 1;						
			case "Cold":
				return 2;	
			case "Fan":
				return 3;
			default:
				return 0;
		}
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public void setMode(int mode) {
		switch (mode) {
		case 0:{
			this.setMode("Off");
			break;		
		}
		case 1:{
			this.setMode("Hot");
			break;			
		}
		case 2:{
			this.setMode("Cold");
			break;			
		}
		case 3:{
			this.setMode("Fan");
			break;			
		}
		default:
			this.setMode("Off");
			break;
		}    
	}

	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	public String getId() {
		return id;
	}	
}