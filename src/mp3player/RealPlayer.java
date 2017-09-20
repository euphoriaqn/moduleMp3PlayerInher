package mp3player;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * Created by user22 on 10.08.2017.
 */
public class RealPlayer extends Application {
    private Pane root = new Pane();

    public static void main(String[] args){

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setWidth(600);
        primaryStage.setHeight(700);
        Label label = new Label();
        label.setTranslateX(20);
        label.setTranslateY(20);
        label.setText("Введіть номер плеєру (1-6)");
        label.setFont(new Font("Courier New", 12));

        TextField countField1 = new TextField();
        countField1.setTranslateX(20);
        countField1.setTranslateY(35);
        countField1.setText("10");

        Button button = new Button();
        button.setTranslateX(20);
        button.setTranslateY(150);
        button.setPrefSize(150,20);
        button.setText("Завантажити плеєр");

        Button button1 = new Button();
        button1.setTranslateX(20);
        button1.setTranslateY(55);
        button1.setPrefSize(150,20);
        button1.setText("Головне меню");


        button.setOnMouseClicked(event -> {
            int choice = Integer.parseInt(countField1.getText());
            if (choice >= 1 && choice <= 6) {
                root.getChildren().removeAll(button, label, countField1);
                root.getChildren().addAll(button1);
                switch (choice) {
                    case 1:
                        Player1 p1 = new Player1(100);
                        p1.show(root);
                        break;
                    case 2:
                        Player2 p2 = new Player2(300);
                        p2.show(root);
                        break;
                    case 3:
                        Player3 p3 = new Player3(400);
                        p3.show(root);
                        break;
                    case 4:
                        Player4 p4 = new Player4(500);
                        p4.show(root);
                        break;
                    case 5:
                        Player5 p5 = new Player5(600);
                        p5.show(root);
                        break;
                    case 6:
                        Player6 p6 = new Player6(700);
                        p6.show(root);
                        break;
                }
            }
        });
        button1.setOnMouseClicked(event -> {
            root.getChildren().clear();
            root.getChildren().addAll(button, label, countField1);
        });


        root.getChildren().addAll(button, label, countField1);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        }
    }
