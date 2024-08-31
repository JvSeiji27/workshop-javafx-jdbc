package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));// Chama o load e carrga a view
			Parent parent = loader.load();

			Scene mainScene = new Scene(parent);//Cena principal
			primaryStage.setScene(mainScene);//Palco da cena
			primaryStage.setTitle("Sample JavaFX application");//Titulo
			primaryStage.show();//E mostro o palco
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
