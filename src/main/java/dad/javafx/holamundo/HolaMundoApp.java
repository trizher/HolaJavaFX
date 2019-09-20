package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundoApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);

		Pane root = new Pane();
		root.getChildren().add(saludoLabel);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("HolaMundoFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
