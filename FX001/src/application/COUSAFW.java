package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class COUSAFW extends Application {
	
	public static void main(String args[]) {
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		//Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root, Color.GREEN);
		
		Image raph = new Image("raph.jpg");
		stage.getIcons().add(raph);
		stage.setTitle("RAPHTALIA BEST GIRL");
		stage.setHeight(400);
		stage.setWidth(400);
		
		stage.setScene(scene);
		stage.show();
	}
}