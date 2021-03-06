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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import main.App;
import objects.AirConditioner;
import objects.Lights;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class FXMLbuilding01Controller implements Initializable {

	// SALA 11
	@FXML
	private Circle LA1;
	@FXML
	private ToggleButton buttonLA1;
	@FXML
	private Circle acA1;	
	@FXML
	private Text displayAC_A1;
	@FXML
	private Button upA1;
	@FXML
	private Button downA1;
	@FXML
	private ImageView hotA1;
	@FXML
	private ImageView coldA1;
	@FXML
	private ImageView fanA1;
	@FXML
	private TextField externalTA1;
	@FXML
	private TextField consumptionA1;
	
	// SALA 12
	@FXML
	private Circle LA2;
	@FXML
	private ToggleButton buttonLA2;
	@FXML
	private Circle acA2;	
	@FXML
	private Text displayAC_A2;
	@FXML
	private Button upA2;
	@FXML
	private Button downA2;
	@FXML
	private ImageView hotA2;
	@FXML
	private ImageView coldA2;
	@FXML
	private ImageView fanA2;
	@FXML
	private TextField externalTA2;
	@FXML
	private TextField consumptionA2;
	
	// SALA 13
	@FXML
	private Circle LA3;
	@FXML
	private ToggleButton buttonLA3;
	@FXML
	private Circle acA3;	
	@FXML
	private Text displayAC_A3;
	@FXML
	private Button upA3;
	@FXML
	private Button downA3;
	@FXML
	private ImageView hotA3;
	@FXML
	private ImageView coldA3;
	@FXML
	private ImageView fanA3;
	@FXML
	private TextField externalTA3;
	@FXML
	private TextField consumptionA3;
	
	// SALA 14
	@FXML
	private Circle LA4;
	@FXML
	private ToggleButton buttonLA4;
	@FXML
	private Circle acA4;	
	@FXML
	private Text displayAC_A4;
	@FXML
	private Button upA4;
	@FXML
	private Button downA4;
	@FXML
	private ImageView hotA4;
	@FXML
	private ImageView coldA4;
	@FXML
	private ImageView fanA4;
	@FXML
	private TextField externalTA4;
	@FXML
	private TextField consumptionA4;

	@FXML
	private PieChart chart;
	
	private ObservableList<PieChart.Data> dataEnergy;

	
		

	
	boolean statusLA1 = false;
	boolean statusLA2 = false;
	boolean statusLA3 = false;
	boolean statusLA4 = false;
    
    public void switchLA1() {
    	this.statusLA1 = this.clickSwitch(Rooms.lightsB01_A01, this.statusLA1, this.buttonLA1, this.LA1);	
    	this.updateStatus();
    }
    
    public void switchUp_A1() {
    	this.switchTemp(true, this.displayAC_A1, Rooms.acB01_A01);
    	this.updateStatus();
    }
    
    public void switchDown_A1() {
    	this.switchTemp(false, this.displayAC_A1, Rooms.acB01_A01);	
    	this.updateStatus();
    }
    
    public void switchMode_A1() {
    	this.switchMode(this.acA1, this.displayAC_A1, Rooms.acB01_A01, 
    			this.upA1, this.downA1, this.hotA1, this.coldA1, this.fanA1);
    	this.updateStatus();
    }    
    
    
    public void switchLA2() {
    	this.statusLA2 = this.clickSwitch(Rooms.lightsB01_A02, this.statusLA2, this.buttonLA2, this.LA2);	
    	this.updateStatus();
    }
    
    public void switchUp_A2() {
    	this.switchTemp(true, this.displayAC_A2, Rooms.acB01_A02);
    	this.updateStatus();
    }
    
    public void switchDown_A2() {
    	this.switchTemp(false, this.displayAC_A2, Rooms.acB01_A02);	
    	this.updateStatus();
    }
    
    public void switchMode_A2() {
    	this.switchMode(this.acA2, this.displayAC_A2, Rooms.acB01_A02, 
    			this.upA2, this.downA2, this.hotA2, this.coldA2, this.fanA2);
    	this.updateStatus();
    }    
    
    
    public void switchLA3() {
    	this.statusLA3 = this.clickSwitch(Rooms.lightsB01_A03, this.statusLA3, this.buttonLA3, this.LA3);	
    	this.updateStatus();
    }
    
    public void switchUp_A3() {
    	this.switchTemp(true, this.displayAC_A3, Rooms.acB01_A03);
    	this.updateStatus();
    }
    
    public void switchDown_A3() {
    	this.switchTemp(false, this.displayAC_A3, Rooms.acB01_A03);	
    	this.updateStatus();
    }
    
    public void switchMode_A3() {
    	this.switchMode(this.acA3, this.displayAC_A3, Rooms.acB01_A03, 
    			this.upA3, this.downA3, this.hotA3, this.coldA3, this.fanA3);
    	this.updateStatus();
    }    
    
    
    public void switchLA4() {
    	this.statusLA4 = this.clickSwitch(Rooms.lightsB01_A04, this.statusLA4, this.buttonLA4, this.LA4);	
    	this.updateStatus();
    }
    
    public void switchUp_A4() {
    	this.switchTemp(true, this.displayAC_A4, Rooms.acB01_A04);
    	this.updateStatus();
    }
    
    public void switchDown_A4() {
    	this.switchTemp(false, this.displayAC_A4, Rooms.acB01_A04);	
    	this.updateStatus();
    }
    
    public void switchMode_A4() {
    	this.switchMode(this.acA4, this.displayAC_A4, Rooms.acB01_A04, 
    			this.upA4, this.downA4, this.hotA4, this.coldA4, this.fanA4);
    	this.updateStatus();
    }    
    
    private boolean clickSwitch(Lights lights, boolean status, ToggleButton x, Circle y) {
    	if(status) {
    		x.setText("On");
    		y.setFill(Color.GRAY);
    		lights.setMode(false);
    	}
    	else{
    		x.setText("Off");  
    		y.setFill(Color.RED);
    		lights.setMode(true);
    	}     	
    	return status=!status;    	
    }
    
    private void switchTemp(boolean isUp,Text displayText, AirConditioner temp) {    	
    	int t = Integer.parseInt(displayText.getText().substring(0, 2));
    	if(isUp) {
	    	t++;
	    	if(t==33)
	    		t--;
    	}
    	else {
    		t--;
	    	if(t==15)
	    		t++;
    	}
    	displayText.setText(t + "??");
    	temp.setTemp(t);    		   		
    }    
    
    private boolean switchMode(Circle circle, Text displayText, AirConditioner temp, 
    		Button up, Button down, ImageView hot, ImageView cold, ImageView fan) {    	
    	temp.setMode(temp.getIntMode()+1);    
    	if(temp.getIntMode()==4)
    		temp.setMode(0);
    	if(temp.getIntMode()==0) {
    		up.setDisable(true);
    		down.setDisable(true);    
    		displayText.setText("--??");
    		circle.setFill(Color.BLACK);
    	}
    	else if (temp.getIntMode()==3){ 
    		up.setDisable(true);
    		down.setDisable(true);    
    		displayText.setText("--??");
    		circle.setFill(Color.LIME);
    	}
    	else {
    		displayText.setText(temp.getTemp()+"??");
    		up.setDisable(false);
    		down.setDisable(false);    		
    		circle.setFill(Color.LIME);
    	}  
    	switch (temp.getIntMode()) {
			case 0:{
				hot.setEffect(new GaussianBlur(6.0));
				cold.setEffect(new GaussianBlur(6.0));
				fan.setEffect(new GaussianBlur(6.0));
				break;
			}
			case 1:
				hot.setEffect(null);				
				break;
			case 2:
				hot.setEffect(new GaussianBlur(6.0));
				cold.setEffect(null);				
				break;
			case 3:{
				hot.setEffect(new GaussianBlur(6.0));
				cold.setEffect(new GaussianBlur(6.0));
				fan.setEffect(null);				
				break;
			}
			default:{
				hot.setEffect(new GaussianBlur(6.0));
				cold.setEffect(new GaussianBlur(6.0));
				fan.setEffect(new GaussianBlur(6.0));				
				break;
			}
		}    	
    	return temp.getIntMode()!=0;    	
    }
    

    
    public void statusBar(ProgressBar x, boolean increment,double number){
    	

    }
    
    public void increaseProgress(ProgressBar x){    	
    	x.setProgress(x.getProgress()+0.1);
    }
    public void decreaseProgress(){    	
    	
    }
    
    public void updateStatus(){    
    	externalTA1.setText(String.valueOf(Rooms.acB01_A01.getExternalTemp())+" ??C");
    	consumptionA1.setText(String.valueOf(Rooms.acB01_A01.getConsumption()+Rooms.lightsB01_A01.getConsumption())+"w/h");
    	
    	externalTA2.setText(String.valueOf(Rooms.acB01_A02.getExternalTemp())+" ??C");
    	consumptionA2.setText(String.valueOf(Rooms.acB01_A02.getConsumption()+Rooms.lightsB01_A02.getConsumption())+"w/h");
    	
    	externalTA3.setText(String.valueOf(Rooms.acB01_A03.getExternalTemp())+" ??C");
    	consumptionA3.setText(String.valueOf(Rooms.acB01_A03.getConsumption()+Rooms.lightsB01_A03.getConsumption())+"w/h");
    	
    	externalTA4.setText(String.valueOf(Rooms.acB01_A04.getExternalTemp())+" ??C");
    	consumptionA4.setText(String.valueOf(Rooms.acB01_A04.getConsumption()+Rooms.lightsB01_A04.getConsumption())+"w/h");
    	
    	dataEnergy = FXCollections.observableArrayList( 
 			   new PieChart.Data("Sala11", Rooms.acB01_A01.getConsumption()+Rooms.lightsB01_A01.getConsumption()), 
			   new PieChart.Data("Sala12", Rooms.acB01_A02.getConsumption()+Rooms.lightsB01_A02.getConsumption()), 
			   new PieChart.Data("Sala13", Rooms.acB01_A03.getConsumption()+Rooms.lightsB01_A03.getConsumption()), 
			   new PieChart.Data("Sala14", Rooms.acB01_A04.getConsumption()+Rooms.lightsB01_A04.getConsumption()),
			   new PieChart.Data("Ba??o V", 00),
 			   new PieChart.Data("Ba??o D", 0), 
 			   new PieChart.Data("Oficina Aseo", 0), 
 			   new PieChart.Data("Sala21", 0), 
 			   new PieChart.Data("Sala22", 0),
 			   new PieChart.Data("Sala23", 0),
 			   new PieChart.Data("Sala24", 0),
 			   new PieChart.Data("Sala25", 0),
 			   new PieChart.Data("Oficina Pagos", 0));   
    	chart.setData(dataEnergy); 
    	String acB01_A01_mode = Rooms.acB01_A01.getMode();
    	int acB01_A01_temp = Rooms.acB01_A01.getTemp();
    	String acB01_A02_mode = Rooms.acB01_A02.getMode();
    	int acB01_A02_temp = Rooms.acB01_A02.getTemp();
    	String acB01_A03_mode = Rooms.acB01_A03.getMode();
    	int acB01_A03_temp = Rooms.acB01_A03.getTemp();
    	String acB01_A04_mode = Rooms.acB01_A04.getMode();
    	int acB01_A04_temp = Rooms.acB01_A04.getTemp();
    	
    	// MQTT
    	String topic = "v1/devices/me/telemetry";
        String broker = "tcp://181.162.226.138:1883";
        String token = "FargsHPCuYAPTV5aG5pj";
        int qos = 0;
        String clientID = "B01";
        MemoryPersistence mp = new MemoryPersistence();

    	boolean lightsB01_A01_power = Rooms.lightsB01_A01.getMode();
    	boolean lightsB01_A02_power = Rooms.lightsB01_A02.getMode();
    	boolean lightsB01_A03_power = Rooms.lightsB01_A03.getMode();
    	boolean lightsB01_A04_power = Rooms.lightsB01_A04.getMode();
    	
    	int B01_A01_energy = Rooms.lightsB01_A01.getConsumption()+Rooms.acB01_A01.getConsumption();
    	int B01_A02_energy = Rooms.lightsB01_A02.getConsumption()+Rooms.acB01_A02.getConsumption();
    	int B01_A03_energy = Rooms.lightsB01_A03.getConsumption()+Rooms.acB01_A03.getConsumption();
    	int B01_A04_energy = Rooms.lightsB01_A04.getConsumption()+Rooms.acB01_A04.getConsumption();
    	try {
            MqttClient client = new MqttClient(broker, clientID, mp);
            MqttConnectOptions opt = new MqttConnectOptions();
            opt.setCleanSession(true);
            opt.setKeepAliveInterval(60);
            opt.setUserName(token);
            client.connect(opt);
            
            String content = "{"
            		+ "\"lightsB01_A01_power\":"+lightsB01_A01_power+","
            		+ "\"lightsB01_A02_power\":"+lightsB01_A02_power+","
            		+ "\"lightsB01_A03_power\":"+lightsB01_A03_power+","
            		+ "\"lightsB01_A04_power\":"+lightsB01_A04_power+","
            		+ "\"B01_A01_energy\":"+B01_A01_energy+","
            		+ "\"B01_A02_energy\":"+B01_A02_energy+","
            		+ "\"B01_A03_energy\":"+B01_A03_energy+","
            		+ "\"B01_A04_energy\":"+B01_A04_energy+","
            		+ "\"acB01_A01_mode\":"+acB01_A01_mode+","
            		+ "\"acB01_A01_temp\":"+acB01_A01_temp+","
            		+ "\"acB01_A02_mode\":"+acB01_A02_mode+","
            		+ "\"acB01_A02_temp\":"+acB01_A02_temp+","
            		+ "\"acB01_A03_mode\":"+acB01_A03_mode+","
            		+ "\"acB01_A03_temp\":"+acB01_A03_temp+","
            		+ "\"acB01_A04_mode\":"+acB01_A04_mode+","
            		+ "\"acB01_A04_temp\":"+acB01_A04_temp+""
            		+ "}";
            
            System.out.println(content);
            
            
            MqttMessage message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            client.publish(topic, message);
        } catch (MqttException e) {
            e.printStackTrace();
        }
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
    	externalTA1.setText(String.valueOf(Rooms.acB01_A01.getExternalTemp())+" ??C");
    	consumptionA1.setText(String.valueOf(Rooms.acB01_A01.getConsumption()+Rooms.lightsB01_A01.getConsumption())+"w/h");
    	
    	externalTA2.setText(String.valueOf(Rooms.acB01_A02.getExternalTemp())+" ??C");
    	consumptionA2.setText(String.valueOf(Rooms.acB01_A02.getConsumption()+Rooms.lightsB01_A02.getConsumption())+"w/h");
    	
    	externalTA3.setText(String.valueOf(Rooms.acB01_A03.getExternalTemp())+" ??C");
    	consumptionA3.setText(String.valueOf(Rooms.acB01_A03.getConsumption()+Rooms.lightsB01_A03.getConsumption())+"w/h");
    	
    	externalTA4.setText(String.valueOf(Rooms.acB01_A04.getExternalTemp())+" ??C");
    	consumptionA4.setText(String.valueOf(Rooms.acB01_A04.getConsumption()+Rooms.lightsB01_A04.getConsumption())+"w/h");
    	
    	
    	dataEnergy = FXCollections.observableArrayList( 
    			   new PieChart.Data("Sala11", Rooms.acB01_A01.getConsumption()+Rooms.lightsB01_A01.getConsumption()), 
 			       new PieChart.Data("Sala12", Rooms.acB01_A02.getConsumption()+Rooms.lightsB01_A02.getConsumption()), 
 			       new PieChart.Data("Sala13", Rooms.acB01_A03.getConsumption()+Rooms.lightsB01_A03.getConsumption()), 
 			   	   new PieChart.Data("Sala14", Rooms.acB01_A04.getConsumption()+Rooms.lightsB01_A04.getConsumption()),
 			   	   new PieChart.Data("Ba??o V", 0),
    			   new PieChart.Data("Ba??o D", 0), 
    			   new PieChart.Data("Oficina Aseo", 0), 
    			   new PieChart.Data("Sala21", 0), 
    			   new PieChart.Data("Sala22", 0),
    			   new PieChart.Data("Sala23", 0),
    			   new PieChart.Data("Sala24", 0),
    			   new PieChart.Data("Sala25", 0),
    			   new PieChart.Data("Oficina Pagos", 0));      	
    	chart.setData(dataEnergy); 
    	chart.setTitle("Consumo Energetico Total");
    	chart.setLabelsVisible(true);
    }    
}