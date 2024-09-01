package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));// Chama o load e carrga a view
			ScrollPane  scrollPane = loader.load();

			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			
			mainScene = new Scene(scrollPane);//Cena principal
			primaryStage.setScene(mainScene);//Palco da cena
			primaryStage.setTitle("Sample JavaFX application");//Titulo
			primaryStage.show();//E mostro o palco
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
