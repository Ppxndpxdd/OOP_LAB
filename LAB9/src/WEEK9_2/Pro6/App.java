package WEEK9_2.Pro6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class App extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create three buttons
		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");

		// Create a hbox
		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(
				btPause, btResume, btReverse);

		// Create a new FanePane
		FanPane fan = new FanPane();

		// Create a slider
		Slider slider = new Slider();
		slider.setMax(5);
		fan.rateProperty().bind(slider.valueProperty());

		// Create a pane
		BorderPane pane = new BorderPane();
		pane.setTop(paneForButtons);
		pane.setCenter(fan);
		pane.setBottom(slider);

		// Create and register handlers
		btPause.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				fan.pause();
			}
		});

		btResume.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				fan.play();
			}
		});

		btReverse.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				fan.reverse();
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("WEEK_9_PRO_6"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
