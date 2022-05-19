package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	
	public void start(Stage arg0) throws Exception {
		Stage stage = new Stage();
		Parent SB_root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(SB_root);
		
		stage.setScene(scene);
		stage.show();
	}
}
