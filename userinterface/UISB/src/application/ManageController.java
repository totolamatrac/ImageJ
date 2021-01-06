package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Tab;

public class ManageController implements Initializable {
	@FXML
	private Tab usertab;
	@FXML
	private Tab imgtab;
	@FXML
	private Tab trytab;
	@FXML
	private Tab camtab;
	@FXML
	private TextField searchbar;
	@FXML
    private Button backbtn;
	@FXML
	private Button srchbtn;
	@FXML
	private Button addbtn;
	@FXML
	private Button modbtn;
	@FXML
	private Button rembtn;
	@FXML
    private void backButtonPushed(ActionEvent event) throws IOException { 
    	        Parent manage = FXMLLoader.load(getClass().getResource("Main.fxml"));
    	        Scene scene = new Scene(manage);
    	        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	        primaryStage.hide();
    	        primaryStage.setScene(scene);
    	        primaryStage.show();
       }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
