package CrossProd;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class RHRfx extends Application {
	private Scene scene = new Scene(new Pane(), 800, 600);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	@Override
	public void start(Stage primaryStage) {
		scene.setRoot(begin(scene));
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public Pane begin(Scene scene) {
		Text welcomeText = new Text("This program computes the direction of any unknown vector of the cross product \n"
				+ "of particle velocity and magnetic field resulting in force on the particle. Supply the program with \n"
				+ "any two of these three vectors and it will produce the direction of the third unknown vector \n"
				+ "If you supply the program with all three vectors it will tell you if the orientation is possible. \n"
				+ "hit the next button to continue.\n");
		welcomeText.setTextAlignment(TextAlignment.CENTER);
		welcomeText.setFont(new Font(18));
		
		Button nextBtn = new Button("Next");
		nextBtn.setOnAction(event -> {
			getInfo(scene);
		});
		
		VBox welcomePane = new VBox(20);
		welcomePane.setAlignment(Pos.CENTER);
		welcomePane.getChildren().addAll(welcomeText, nextBtn);
		
		return welcomePane;
	}
	
	/*
	 * needs to have image/button for each direction.Needs to have image/button for positive/negative charged particle.
	 * Buttons need to store direction and charge of particle. needs button to confirm that you are headed to the display pane
	 * could use way to clear direction stored on vector
	 */
	public Pane getInfo(Scene scene) {
		
		VBox infoPane = new VBox(20);
		
		return infoPane;
	}
	
//	public Pane displayPane(Scene scene) {
//		
//	}
}
