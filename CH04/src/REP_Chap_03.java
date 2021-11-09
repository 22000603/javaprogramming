
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class REP_Chap_03 extends Application {
	
	public static final int WINDOW_WIDTH = 400;
	public static final int WINDOW_HEIGHT = 300;
	public static final int SYMBOL_DIAMETER = 50;
	
	enum Colors {BLUE, YELLOW, BLACK, GREEN, RED}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start (Stage primaryStage) throws Exception{
		
		Group root = new Group();
		Scene scene = new Scene(root);
		
		Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		int x_symbol = 0;
		int y_symbol = 0;
		
		Colors[] arr = Colors.values();
		for(Colors color : arr)
		{
			switch(color)
			{
				
			case BLUE:
				gc.setStroke(Color.BLUE);
				gc.strokeOval(x_symbol, y_symbol, SYMBOL_DIAMETER, SYMBOL_DIAMETER);
				break;
				
			case YELLOW:
				x_symbol += 30;
				gc.setStroke(Color.YELLOW);
				gc.strokeOval(x_symbol, y_symbol + 30, SYMBOL_DIAMETER, SYMBOL_DIAMETER);
				break;
				
			case BLACK:
				x_symbol += 30;
				gc.setStroke(Color.BLACK);
				gc.strokeOval(x_symbol, y_symbol, SYMBOL_DIAMETER, SYMBOL_DIAMETER);
				break;
				
			case GREEN:
				x_symbol += 30;
				gc.setStroke(Color.GREEN);
				gc.strokeOval(x_symbol, y_symbol + 30, SYMBOL_DIAMETER, SYMBOL_DIAMETER);
				break;
				
			case RED:
				x_symbol += 30;
				gc.setStroke(Color.RED);
				gc.strokeOval(x_symbol , y_symbol, SYMBOL_DIAMETER, SYMBOL_DIAMETER);
				break;
			
			default:
				break;
			}
		}
		
		root.getChildren().add(canvas);
		primaryStage.setTitle("Rings in JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
