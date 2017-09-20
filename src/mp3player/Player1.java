package mp3player;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * Created by user22 on 10.08.2017.
 */
public class Player1 extends MainMp3 {

        public Player1(int price) {
        super(price);
        System.out.println("Об'єкт Player1 создан ");
    }

    @Override
    public void show(Pane root) {

        Label nameOfPlayer = new Label();
        nameOfPlayer.setTranslateX(240);
        nameOfPlayer.setTranslateY(10);
        nameOfPlayer.setText("MP3 PLAYER #1");
        nameOfPlayer.setFont(new Font("Courier New", 12));
        nameOfPlayer.setTextFill(Paint.valueOf("#ff0000"));

        Label priceOfPlayer = new Label();
        priceOfPlayer.setTranslateX(180);
        priceOfPlayer.setTranslateY(180);
        priceOfPlayer.setText(Integer.toString(getPrice()) + "$");
        priceOfPlayer.setFont(new Font("Courier New", 12));

        Label playOneSong = new Label();
        playOneSong.setTranslateX(180);
        playOneSong.setTranslateY(210);
        playOneSong.setText(playSong());
        playOneSong.setFont(new Font("Courier New", 12));

        Button getPriceButton = new Button();
        getPriceButton.setTranslateX(20);
        getPriceButton.setTranslateY(180);
        getPriceButton.setPrefSize(150,20);
        getPriceButton.setText("Узнать цену плеера");

        Button playSongButton = new Button();
        playSongButton.setTranslateX(20);
        playSongButton.setTranslateY(210);
        playSongButton.setPrefSize(150,20);
        playSongButton.setText("Проиграть песню");

        getPriceButton.setOnMouseClicked(event -> {
            if (priceOfPlayer != null) {
                root.getChildren().removeAll(priceOfPlayer);
            }
            root.getChildren().addAll(priceOfPlayer);

        });
        playSongButton.setOnMouseClicked(event -> {
            if (playOneSong != null) {
                root.getChildren().removeAll(playOneSong);
            }
            root.getChildren().addAll(playOneSong);
        });
        root.getChildren().addAll(nameOfPlayer, getPriceButton, playSongButton);
//
//        Scene scene = new Scene(root);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
