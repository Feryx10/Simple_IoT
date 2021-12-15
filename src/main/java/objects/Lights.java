package objects;

public class Lights{
	private final String id;
	private boolean mode;
	private double nBulb;
	private final double consumption;	

	public Lights(String id, int nBulb) {		
		this.id = id;	
		this.mode = false;
		this.nBulb = nBulb;
		this.consumption = 25.0*nBulb;
	}

	public boolean isMode() {
		return mode;
	}

	public void setMode(boolean mode) {
		this.mode = mode;
	}

	public double getnBulb() {
		return nBulb;
	}

	public void setnBulb(double nBulb) {
		this.nBulb = nBulb;
	}

	public String getId() {
		return id;
	}

	public double getConsumption() {
		return consumption;
	}
}