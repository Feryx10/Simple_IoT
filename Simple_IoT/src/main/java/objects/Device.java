package objects;

public interface Device {	
	int getID();
	String getBuilding();
	void setBuilding(String building);
	void setStandBy(boolean on);
	String getStatus();	
}