package windows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import objects.AirConditioner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import main.App;

/**
 * FXML Controller class
 *
 * @author F. Pino
 */
public class FXMLmainController implements Initializable {
	
	@FXML
	private Circle L01;
	@FXML
	private Text Temp01;
	
	boolean statusL01 = true;
	

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("windowBuilding01");
    }
    
    public void switch01() {
    	
    	this.updateStatus();
    }
    
    public boolean clickSwitch(boolean status, ToggleButton x, Circle y) {
    	if(status) {
    		x.setText("Off");
    		y.setFill(Color.RED);
    	}
    	else{
    		x.setText("On");  
    		y.setFill(Color.GREY);
    	}     	
    	return status=!status;    	
    }
    
    public void updateStatus(){    	  	
    		   	
    }
    
    
}
