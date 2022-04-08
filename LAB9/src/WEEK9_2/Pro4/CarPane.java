package WEEK9_2.Pro4;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class CarPane extends Pane {
	private double x = 0;
	private double y = 100;
	private double radius = 5;
	private double smallRadius = 2.5;
	private Rectangle rectangle;
	private Rectangle roadRec;
	private Polygon polygon;
	private Circle circle1;
	private Circle circle2;
	private Circle circle3;
	private Circle circle4;
	private Timeline animation;

	/** Construct and animate a default CarPane */
	CarPane() {
		drawRoad();
		drawCar();
		animation = new Timeline(
				new KeyFrame(Duration.millis(50), e -> moveCar()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}

	private void drawRoad() {
		getChildren().clear();
		roadRec = new Rectangle(x, y - 10, 1000, 20);
		getChildren().addAll(roadRec);
	}

	/** Create a car an place it in the pane */
	private void drawCar() {
		getChildren().clear();

		rectangle = new Rectangle(x, y - 25, 50, 10);
		polygon = new Polygon(x + 10, y - 25, x + 20, y - 35, x + 30,
				y - 35, x + 40, y - 25);
		circle1 = new Circle(x + 15, y - 10, radius);
		circle2 = new Circle(x + 35, y - 10, radius);
		circle3 = new Circle(x + 15, y - 10, smallRadius);
		circle4 = new Circle(x + 35, y - 10, smallRadius);
		roadRec.setFill(Color.DARKGRAY);
		rectangle.setFill(
				Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		polygon.setFill(
				Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		circle1.setFill(
				Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		circle2.setFill(
				Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		circle3.setFill(
				Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		circle4.setFill(
				Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		getChildren().addAll(roadRec, rectangle, circle1, circle2, circle3, circle4, polygon);
	}

	/** Pause animation */
	public void pause() {
		animation.pause();
	}

	/** Play animation */
	public void play() {
		animation.play();
	}

	/** Increase rate by 1 */
	public void increaseSpeed() {
		animation.play();
		animation.setRate(animation.getRate() + 1);
	}

	/** decrease rate by 1 */
	public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0 ? animation.getRate() - 1 : 0);
		if (animation.getRate() == 0) {
			animation.stop();
		}
	}

	/** Redraw car with new x value */
	protected void moveCar() {
		if (x <= getWidth()) {
			x += 1;
		} else
			x = 0;
		drawCar();
	}
}
