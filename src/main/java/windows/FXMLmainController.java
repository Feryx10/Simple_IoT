package windows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import objects.AirConditioner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
	private Button switchL01;
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
        App.setRoot("windowSecondFloor");
    }
    
    public void switch01() {
    	this.statusL01 = this.clickSwitch(statusL01, switchL01, L01);
    	this.updateStatus();
    }
    
    public boolean clickSwitch(boolean status, Button x, Circle y) {
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
