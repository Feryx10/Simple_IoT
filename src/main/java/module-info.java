module main {
    requires javafx.controls;
    requires javafx.fxml;	
	requires javafx.base;
	requires javafx.graphics;
	requires org.eclipse.paho.client.mqttv3;

    opens windows to javafx.fxml;    
    opens main to javafx.fxml;  
    exports main;
    exports windows;
}
