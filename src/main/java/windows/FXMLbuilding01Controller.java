package windows;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import main.App;
import objects.AirConditioner;
import objects.Lights;

public class FXMLbuilding01Controller implements Initializable {

	
	@FXML
	private Circle LB1;
	@FXML
	private Button switchLB1;
	@FXML
	private ProgressBar pbB1;
	
	@FXML
	private Circle LB2;
	@FXML
	private Button switchLB2;
	@FXML
	private ProgressBar pbB2;
	
	@FXML
	private Circle LB3;
	@FXML
	private Button switchLB3;
	@FXML
	private ProgressBar pbB3;
	
	@FXML
	private Circle LB4;
	@FXML
	private Button switchLB4;
	@FXML
	private ProgressBar pbB4;
	
	@FXML
	private Text Temp01;
	@FXML
	private PieChart chart;
	@FXML
	private Rectangle rectangle;
	
	//Salas - Labs - Banos - Oficinas
	
	//--- Servicioa Multiples ---
	//Piso 1	
	private Lights lightsB01_A01 = new Lights("lightsB01_A01", 4);
	private AirConditioner acB01_A01 = new AirConditioner("acB01_A01");	
	private Lights lightsB01_A02 = new Lights("lightsB01_A02", 4);
	private AirConditioner acB01_A02 = new AirConditioner("acB01_A02");	
	private Lights lightsB01_A03 = new Lights("lightsB01_A03", 4);
	private AirConditioner acB01_A03 = new AirConditioner("acB01_A03");	
	private Lights lightsB01_A04 = new Lights("lightsB01_A04", 4);
	private AirConditioner acB01_A04 = new AirConditioner("acB01_A04");
	
	private Lights lightsB01_A05 = new Lights("lightsB01_A05", 2);
	private AirConditioner acB01_A05 = new AirConditioner("acB01_A05");	
	private Lights lightsB01_A06 = new Lights("lightsB01_A06", 2);
	private AirConditioner acB01_A06 = new AirConditioner("acB01_A06");
	
	private Lights lightsB01_A07 = new Lights("lightsB01_A07", 1);
	private AirConditioner acB01_A07 = new AirConditioner("acB01_A07");
	
	//Piso 2	
	private Lights lightsB01_B01 = new Lights("lightsB01_B01", 4);
	private AirConditioner acB01_B01 = new AirConditioner("acB01_B01");
	private Lights lightsB01_B02 = new Lights("lightsB01_B02", 4);
	private AirConditioner acB01_B02 = new AirConditioner("acB01_B02");
	private Lights lightsB01_B03 = new Lights("lightsB01_B03", 4);
	private AirConditioner acB01_B03 = new AirConditioner("acB01_B03");
	private Lights lightsB01_B04 = new Lights("lightsB01_B04", 2);
	private AirConditioner acB01_B04 = new AirConditioner("acB01_B04");
	private Lights lightsB01_B05 = new Lights("lightsB01_B05", 2);
	private AirConditioner acB01_B05 = new AirConditioner("acB01_B05");
	
	private Lights lightsB01_B06 = new Lights("lightsB01_B06", 2);
	private AirConditioner acB01_B06 = new AirConditioner("acB01_B06");	
	private Lights lightsB01_B07 = new Lights("lightsB01_B07", 2);
	private AirConditioner acB01_B07 = new AirConditioner("acB01_B07");
	
	private Lights lightsB01_B08 = new Lights("lightsB01_B08", 1);
	private AirConditioner acB01_B08 = new AirConditioner("acB01_B08");
	
	
	//--- Edificio de Minas ---
	//Piso 1	
	private Lights lightsB02_A01 = new Lights("lightsB02_A01", 4);
	private AirConditioner acB02_A01 = new AirConditioner("acB02_A01");	
	private Lights lightsB02_A02 = new Lights("lightsB02_A02", 4);
	private AirConditioner acB02_A02 = new AirConditioner("acB02_A02");	
	private Lights lightsB02_A03 = new Lights("lightsB02_A03", 4);
	private AirConditioner acB02_A03 = new AirConditioner("acB02_A03");	
	
	private Lights lightsB02_A04 = new Lights("lightsB02_A04", 4);
	private AirConditioner acB02_A04 = new AirConditioner("acB02_A04");	
	
	private Lights lightsB02_A05 = new Lights("lightsB02_A05", 2);
	private AirConditioner acB02_A05 = new AirConditioner("acB02_A05");	
	private Lights lightsB02_A06 = new Lights("lightsB01_A06", 2);
	private AirConditioner acB02_A06 = new AirConditioner("acB02_A06");
	
	private Lights lightsB02_A07 = new Lights("lightsB02_A07", 1);
	private AirConditioner acB02_A07 = new AirConditioner("acB02_A07");
		
	//Piso 2	
	private Lights lightsB02_B01 = new Lights("lightsB02_B01", 4);
	private AirConditioner acB02_B01 = new AirConditioner("acB02_B01");
	private Lights lightsB02_B02 = new Lights("lightsB02_B02", 4);
	private AirConditioner acB02_B02 = new AirConditioner("acB02_B02");
	
	private Lights lightsB02_B03 = new Lights("lightsB02_B03", 4);
	private AirConditioner acB02_B03 = new AirConditioner("acB02_B03");
	private Lights lightsB02_B04 = new Lights("lightsB02_B04", 4);
	private AirConditioner acB02_B04 = new AirConditioner("acB02_B04");
	
	private Lights lightsB02_B05 = new Lights("lightsB02_B05", 4);
	private AirConditioner acB02_B05 = new AirConditioner("acB02_B05");
	
	
	//--- Edificio de Electrica ---
	//Piso 1	
	private Lights lightsB03_A01 = new Lights("lightsB03_A01", 4);
	private AirConditioner acB03_A01 = new AirConditioner("acB03_A01");	
	private Lights lightsB03_A02 = new Lights("lightsB03_A02", 4);
	private AirConditioner acB03_A02 = new AirConditioner("acB03_A02");	
	private Lights lightsB03_A03 = new Lights("lightsB03_A03", 4);
	private AirConditioner acB03_A03 = new AirConditioner("acB03_A03");		
	private Lights lightsB03_A04 = new Lights("lightsB03_A04", 4);
	private AirConditioner acB03_A04 = new AirConditioner("acB03_A04");	
	
	private Lights lightsB03_A05 = new Lights("lightsB03_A05", 2);
	private AirConditioner acB03_A05 = new AirConditioner("acB03_A05");	
	private Lights lightsB03_A06 = new Lights("lightsB03_A06", 2);
	private AirConditioner acB03_A06 = new AirConditioner("acB03_A06");
	
	private Lights lightsB03_A07 = new Lights("lightsB03_A07", 1);
	private AirConditioner acB03_A07 = new AirConditioner("acB03_A07");
	
	
	//--- Gimnasio ---
	//Piso 1	
	private Lights lightsB04_A01 = new Lights("lightsB04_A01", 4);
	private AirConditioner acB04_A01 = new AirConditioner("acB04_A01");	
	
	private Lights lightsB04_A02 = new Lights("lightsB04_A02", 4);
	private AirConditioner acB04_A02 = new AirConditioner("acB04_A02");	
	private Lights lightsB04_A03 = new Lights("lightsB04_A03", 4);
	private AirConditioner acB04_A03 = new AirConditioner("acB04_A03");	
	
	private Lights lightsB04_A04 = new Lights("lightsB04_A04", 4);
	private AirConditioner acB04_A04 = new AirConditioner("acB04_A04");	
	
	private Lights lightsB05_A05 = new Lights("lightsB05_A05", 2);
	private AirConditioner acB05_A05 = new AirConditioner("acB05_A05");	
	
	//--- Establo ---
	//Piso 1	
	private Lights lightsB05_A01 = new Lights("lightsB05_A01", 4);
	private AirConditioner acB05_A01 = new AirConditioner("acB05_A01");		
	private Lights lightsB05_A02 = new Lights("lightsB05_A02", 4);
	private AirConditioner acB05_A02 = new AirConditioner("acB05_A02");	
	
	//--- Edificio laboratorios ---
	//Piso 1	
	private Lights lightsB06_A01 = new Lights("lightsB06_A01", 4);
	private AirConditioner acB06_A01 = new AirConditioner("acB06_A01");
	private Lights lightsB06_A02 = new Lights("lightsB06_A02", 4);
	private AirConditioner acB06_A02 = new AirConditioner("acB06_A02");
	
	private Lights lightsB06_A03 = new Lights("lightsB06_A03", 4);
	private AirConditioner acB06_A03 = new AirConditioner("acB06_A03");
	
	private Lights lightsB06_A04 = new Lights("lightsB06_A04", 2);
	private AirConditioner acB06_A04 = new AirConditioner("acB06_A04");
	
	private Lights lightsB06_A05 = new Lights("lightsB06_A05", 2);
	private AirConditioner acB06_A05 = new AirConditioner("acB06_A05");	
	private Lights lightsB06_A06 = new Lights("lightsB06_A06", 2);
	private AirConditioner acB06_A06 = new AirConditioner("acB06_A06");	
	
	//Piso2
	private Lights lightsB06_B01 = new Lights("lightsB06_B01", 4);
	private AirConditioner acB06_B01 = new AirConditioner("acB06_B01");
	
	private Lights lightsB06_B02 = new Lights("lightsB06_B02", 4);
	private AirConditioner acB06_B02 = new AirConditioner("acB06_B02");
	private Lights lightsB06_B03 = new Lights("lightsB06_B03", 4);
	private AirConditioner acB06_B03 = new AirConditioner("acB06_B03");
	private Lights lightsB06_B04 = new Lights("lightsB06_B04", 2);
	private AirConditioner acB06_B04 = new AirConditioner("acB06_B04");
	
	private Lights lightsB06_B05 = new Lights("lightsB06_B05", 2);
	private AirConditioner acB06_B05 = new AirConditioner("acB06_B05");	
	private Lights lightsB06_B06 = new Lights("lightsB06_B06", 2);
	private AirConditioner acB06_B06 = new AirConditioner("acB06_B06");	
	
	private Lights lightsB06_B07 = new Lights("lightsB06_B07", 2);
	private AirConditioner acB06_B07 = new AirConditioner("acB06_B07");
	
	private Lights lightsB06_B08 = new Lights("lightsB06_B08", 1);
	private AirConditioner acB06_B08 = new AirConditioner("acB06_B08");	

	
	boolean statusLB1 = false;
	boolean statusLB2 = false;
	boolean statusLB3 = false;
	boolean statusLB4 = false;
    
    public void switchLB1() {
    	this.statusLB1 = this.clickSwitch(statusLB1, switchLB1, LB1);
    	
    	
    	this.updateStatus();
    }
    
    public void switchLB2() {
    	this.statusLB2 = this.clickSwitch(statusLB2, switchLB2, LB2);
    	this.updateStatus();
    }
    
    public void switchLB3() {
    	this.statusLB3 = this.clickSwitch(statusLB3, switchLB3, LB3);
    	this.updateStatus();
    }
    
    public void switchLB4() {
    	this.statusLB4 = this.clickSwitch(statusLB4, switchLB4, LB4);
    	this.updateStatus();
    }
    
    public boolean clickSwitch(boolean status, Button x, Circle y) {
    	if(status) {
    		x.setText("On");
    		y.setFill(Color.GRAY);
    	}
    	else{
    		x.setText("Off");  
    		y.setFill(Color.RED);
    	}     	
    	return status=!status;    	
    }
    
    public void statusBar(ProgressBar x, boolean increment,double number){
    	double temp = x.getProgress();
    	double temp2=0.0;
    	if(increment)
    		for (double i = 0.0; i < number*0.0005; i+=0.0001) {
    			if(temp2!=(temp+Math.floor(i*100.0)/10.0)) {    	
    				increaseProgress(x);    		
    			
    			}    			    			
    			App.wait(50);
    		}
    	else
    		for (double i = number*0.005; i > 0; i-=0.001) {
    			x.setProgress(temp-i);
    			App.wait(6);
    		}    	
    }
    
    public void increaseProgress(ProgressBar x){    	
    	x.setProgress(x.getProgress()+0.1);
    }
    public void decreaseProgress(){    	
    	
    }
    
    public String updateStatus(){    
    	String status=" ";
    	this.statusBar(pbB1, statusLB1, lightsB01_A01.getConsumption());  	
    	
    	return status;
    }
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("windowMain");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {    
    	ObservableList<PieChart.Data> dataEnergy = FXCollections.observableArrayList( 
    			   new PieChart.Data("SalaA1", 13), 
 			       new PieChart.Data("SalaA2", 25), 
 			       new PieChart.Data("SalaA3", 10), 
 			   	   new PieChart.Data("SalaA4", 10),
 			   	   new PieChart.Data("OficinaP1", 10),
    			   new PieChart.Data("SalaB1", 13), 
    			   new PieChart.Data("SalaB2", 25), 
    			   new PieChart.Data("SalaB3", 10), 
    			   new PieChart.Data("SalaB4", 10),
    			   new PieChart.Data("SalaB5", 22),
    			   new PieChart.Data("OficinaP2", 10));     	
    	chart.setData(dataEnergy); 
    	chart.setTitle("Consumo Energetico Total");
    	chart.setLabelsVisible(true);
    }    
}