package WEEK9_2.Pro1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class App extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();

        ImageView firstImg = new ImageView(new Image("C:/javaProject/LAB9/src/WEEK9_2/Pro1/England.jpg"));
        firstImg.setFitHeight(200);
        firstImg.setFitWidth(300);
        grid.add(firstImg, 0, 0);

        ImageView secondImg = new ImageView(new Image("C:/javaProject/LAB9/src/WEEK9_2/Pro1/Canada.png"));
        secondImg.setFitHeight(200);
        secondImg.setFitWidth(300);
        grid.add(secondImg, 1, 0);

        ImageView thirdImg = new ImageView(new Image("C:/javaProject/LAB9/src/WEEK9_2/Pro1/China.png"));
        thirdImg.setFitHeight(200);
        thirdImg.setFitWidth(300);
        grid.add(thirdImg, 0, 1);

        ImageView fourthImg = new ImageView(new Image("C:/javaProject/LAB9/src/WEEK9_2/Pro1/USA.png"));
        fourthImg.setFitHeight(200);
        fourthImg.setFitWidth(300);
        grid.add(fourthImg, 1, 1);

        Scene scene = new Scene(grid);
        primaryStage.setTitle("WEEK_9_PRO_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
