package calculadroa;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private calculo vista;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		vista = new calculo();
		
		Scene scene = new Scene(vista.getView());
		
		primaryStage.setTitle("La calculatrichi");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
