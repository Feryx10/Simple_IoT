module main {
    requires javafx.controls;
    requires javafx.fxml;	
	requires javafx.base;

    opens windows to javafx.fxml;    
    opens main to javafx.fxml;  
    exports main;
    exports windows;
}
