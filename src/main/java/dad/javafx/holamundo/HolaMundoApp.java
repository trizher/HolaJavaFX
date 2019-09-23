package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundoApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label saludoLabel = new Label();
		saludoLabel.setText("Aqu� saldr� el saludo");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);
		
		Button saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setLayoutX(20);
		saludarButton.setLayoutY(80);
//		saludarButton.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				saludoLabel.setText("Hola JavaFX!");
//				saludarButton.setVisible(false);
//			}
//		});
		
		saludarButton.setOnAction(event -> {
			saludoLabel.setText("Hola JavaFX");
			saludarButton.setVisible(false);
		});
		
		Pane root = new Pane();
		root.getChildren().addAll(saludoLabel, saludarButton);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("HolaMundoFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
