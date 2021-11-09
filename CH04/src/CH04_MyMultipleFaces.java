import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CH04_MyMultipleFaces extends Application {

	public static final int WINDOW_WIDTH = 650;
	public static final int WINDOW_HEIGHT = 400;

	public static final int FACE_DIAMETER = 50;
	public static final int X_FACE = 10;
	public static final int Y_FACE = 5;

	public static final int EYE_WIDTH = 5;
	public static final int EYE_HEIGHT = 10;
	public static final int X_RIGHT_EYE = 20;
	public static final int Y_RIGHT_EYE = 15;
	public static final int X_LEFT_EYE = 45;
	public static final int Y_LEFT_EYE = Y_RIGHT_EYE;

	public static final int NOSE_DIAMETER = 5;
	public static final int X_NOSE = 32;
	public static final int Y_NOSE = 25;

	public static final int MOUTH_WIDTH = 30;
	public static final int MOUTH_HEIGHT = 0;
	public static final int X_MOUTH = 20;
	public static final int Y_MOUTH = 35;
	public static final int MOUTH_START_ANGLE = 180;
	public static final int MOUTH_EXTENT_ANGLE = 180;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root);

		Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		int i, xOffset, yOffset;

		for (i = 0; i <= 8; i++) { // Draw one face
			xOffset = 50 * i;
			yOffset = 30 * i;

			// Draw face circle
			if (i % 3 == 0) // yellow face
				gc.setFill(Color.YELLOW);
			else if (i % 3 == 1) // green face
				gc.setFill(Color.GREEN);
			else // gray face
				gc.setFill(Color.GRAY);

			gc.fillOval(X_FACE + xOffset, Y_FACE + yOffset, FACE_DIAMETER, FACE_DIAMETER);
			gc.setStroke(Color.BLACK);
			gc.strokeOval(X_FACE + xOffset, Y_FACE + yOffset, FACE_DIAMETER, FACE_DIAMETER);

			// Draw eyes
			gc.setFill(Color.BLUE);
			gc.fillOval(X_RIGHT_EYE + xOffset, Y_RIGHT_EYE + yOffset, EYE_WIDTH, EYE_HEIGHT);
			gc.fillOval(X_LEFT_EYE + xOffset, Y_LEFT_EYE + yOffset, EYE_WIDTH, EYE_HEIGHT);

			// Draw nose
			gc.setFill(Color.BLACK);
			gc.fillOval(X_NOSE + xOffset, Y_NOSE + yOffset, NOSE_DIAMETER, NOSE_DIAMETER);

			// Draw mouth
			gc.setStroke(Color.RED);
			gc.strokeArc(X_MOUTH + xOffset, Y_MOUTH + yOffset, MOUTH_WIDTH, MOUTH_HEIGHT + i+1, MOUTH_START_ANGLE,
					MOUTH_EXTENT_ANGLE, ArcType.OPEN);

			// text
			gc.setFont(Font.font("Times New Roman", 12));
			gc.fillText("Kiss!!.", X_FACE + xOffset + FACE_DIAMETER, Y_FACE + yOffset+10);
		}
		xOffset = 50 * i;
		yOffset = 30 * i;

		// Draw kissing face
		// Draw face circle
		gc.setStroke(Color.BLACK);
		gc.strokeOval(X_FACE + xOffset, Y_FACE + yOffset, FACE_DIAMETER, FACE_DIAMETER);
		// Draw eyes
		gc.setFill(Color.BLUE);
		gc.fillOval(X_RIGHT_EYE + xOffset, Y_RIGHT_EYE + yOffset, EYE_WIDTH, EYE_HEIGHT);
		gc.fillOval(X_LEFT_EYE + xOffset, Y_LEFT_EYE + yOffset, EYE_WIDTH, EYE_HEIGHT);
		// Draw nose
		gc.setFill(Color.BLACK);
		gc.fillOval(X_NOSE + xOffset, Y_NOSE + yOffset, NOSE_DIAMETER, NOSE_DIAMETER);
		// Draw mouth in shape of a kiss
		gc.setFill(Color.RED);
		gc.fillOval(X_MOUTH + xOffset + 10, Y_MOUTH + yOffset, MOUTH_WIDTH - 20, MOUTH_WIDTH - 20);
		gc.setStroke(Color.RED);
		gc.strokeOval(X_MOUTH + xOffset + 10, Y_MOUTH + yOffset , MOUTH_WIDTH - 20, MOUTH_WIDTH - 20);
		// text
		gc.setFill(Color.BLACK);
		gc.setFont(Font.font("Times New Roman", 12));
		gc.fillText("Kiss, Kiss.", X_FACE + xOffset + FACE_DIAMETER, Y_FACE + yOffset+10);

		// Draw final face
		i++;
		xOffset = 50 * i;
		yOffset = 30 * i;
		// Draw face circle
		gc.setFill(Color.GRAY);
		gc.fillOval(X_FACE + xOffset, Y_FACE + yOffset, FACE_DIAMETER, FACE_DIAMETER);
		gc.setStroke(Color.BLACK);
		gc.strokeOval(X_FACE + xOffset, Y_FACE + yOffset, FACE_DIAMETER, FACE_DIAMETER);
		// Draw eyes
		gc.setFill(Color.BLUE);
		gc.fillOval(X_RIGHT_EYE + xOffset, Y_RIGHT_EYE + yOffset, EYE_WIDTH, EYE_HEIGHT);
		gc.fillOval(X_LEFT_EYE + xOffset, Y_LEFT_EYE + yOffset, EYE_WIDTH, EYE_HEIGHT);
		// Draw nose
		gc.setFill(Color.BLACK);
		gc.fillOval(X_NOSE + xOffset, Y_NOSE + yOffset, NOSE_DIAMETER, NOSE_DIAMETER);
		// Draw mouth in shape of a kiss
		gc.setStroke(Color.RED);
		gc.strokeArc(X_MOUTH + xOffset, Y_MOUTH + yOffset, MOUTH_WIDTH, MOUTH_HEIGHT+i+1, MOUTH_START_ANGLE, MOUTH_EXTENT_ANGLE, ArcType.OPEN);
		// text
		gc.setFont(Font.font("Courier New", 16));
		gc.fillText("Tee Hee.", X_FACE + xOffset + FACE_DIAMETER, Y_FACE + yOffset+10);
		
		root.getChildren().add(canvas);
		primaryStage.setTitle("MultipleFaces in JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
