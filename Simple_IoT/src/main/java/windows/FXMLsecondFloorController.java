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
import objects.Lights;

public class FXMLsecondFloorController implements Initializable {

	
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
	
	private Lights lightsB1 = new Lights(01, "Phillps", "Servicios Multiples", false, 150.0);
	private Lights lightsB2 = new Lights(02, "Phillps", "Servicios Multiples", false, 150.0);
	private Lights lightsB3 = new Lights(03, "GeneralElectric", "Servicios Multiples", false, 92.0);
	private Lights lightsB4 = new Lights(04, "GeneralElectric", "Servicios Multiples", false, 92.0);
	private Lights lightsB5 = new Lights(04, "GeneralElectric", "Servicios Multiples", false, 92.0);
	private Lights lightsP2 = new Lights(04, "", "Servicios Multiples", false, 30.0);
	
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
    	this.statusBar(pbB1, statusLB1, lightsB1.getConsumption());  	
    	
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