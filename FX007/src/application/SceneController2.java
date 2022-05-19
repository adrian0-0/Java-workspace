package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneController2 {

	@FXML
	Label congratulations;
	
	public void displayCongratulations(String username) {
		congratulations.setText("Olá, " + username);
		
	}
}
