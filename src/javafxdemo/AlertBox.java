package javafxdemo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

//prevent user from clicking previous main window you opened this window from
public class AlertBox{
	
	public static void display(String title, String message) {
		Stage window = new Stage();
		
		//prevent user from inputting anything to prev window
		window.initModality(Modality.APPLICATION_MODAL);
		
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		Button closeButton = new Button("Close the window");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		//alert box must be closed to make additional action
		window.showAndWait();
	}

	
}
