package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class MainUI extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(login,800,600);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}