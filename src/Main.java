
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		
		
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("views/View.fxml"));
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("ressources/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Algoritme Close");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
