package application;

import java.io.File;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController implements Initializable {
	@FXML
	private ImageView imageview;
	@FXML
	private Button importbtn;
	@FXML
	private Button runbtn;
	@FXML
	private Button seebtn;
	@FXML
	private Button exportbtn;
	@FXML
	private Button managebtn;
	@FXML
	private Button exitbtn;
	@FXML
    private void manageButtonPushed(ActionEvent event) throws IOException { 
    	        Parent manage = FXMLLoader.load(getClass().getResource("Manage.fxml"));
    	        Scene scene = new Scene(manage);
    	        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	        primaryStage.hide();
    	        primaryStage.setScene(scene);
    	        primaryStage.show();
       }
	@FXML
    private void exitButtonPushed(ActionEvent event) throws IOException { 
    	        Parent manage = FXMLLoader.load(getClass().getResource("Login.fxml"));
    	        Scene scene = new Scene(manage);
    	        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	        primaryStage.hide();
    	        primaryStage.setScene(scene);
    	        primaryStage.show();
       }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//File file = new File("file:///D:/workspace/UISB/src/application/TBTv1(1).jpg");
       // Image image = new Image(file.toURI().toString());
       // imageview.setImage(image);
	}
}
