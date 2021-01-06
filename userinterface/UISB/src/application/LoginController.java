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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private TextField unfield;
    @FXML
    private PasswordField pwfield;
    @FXML
    private Button loginbtn;
    @FXML
    private void loginButtonPushed(ActionEvent event) throws IOException { 
    	  //  if(pwfield.getText().equals("alphabetathetagamma"))
    	  //  {
    	        Parent manage = FXMLLoader.load(getClass().getResource("Main.fxml"));
    	        Scene scene = new Scene(manage);
    	        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	        primaryStage.hide();
    	        primaryStage.setScene(scene);
    	        primaryStage.show();
    	 //   }
       }
    @FXML
    private void changeLabelValue(){
        unfield.setText("ça marche");
        System.out.println("check2");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
