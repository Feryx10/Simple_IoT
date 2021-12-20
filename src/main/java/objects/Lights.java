package objects;

public class Lights{
	private final String id;
	private boolean mode;
	private int nBulb;
	private int consumption;	

	public Lights(String id, int nBulb) {		
		this.id = id;	
		this.mode = false;
		this.nBulb = nBulb;
		this.consumption = 85*nBulb;
	}

	public boolean getMode() {
		return mode;
	}

	public void setMode(boolean mode) {
		this.mode = mode;
	}

	public double getnBulb() {
		return nBulb;
	}

	public void setnBulb(int nBulb) {
		this.nBulb = nBulb;
		this.consumption = 85*nBulb;		
	}

	public String getId() {
		return id;
	}

	public int getConsumption() {
		if(this.getMode())			
			return consumption;
		else 
			return 0;
	}
}