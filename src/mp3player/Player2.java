package mp3player;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player2 extends MainMp3 {

    public Player2(int price) {
        super(price);
        System.out.println("Об'єкт Player2 создан");
    }

    @Override
    public String playSong() {
        String playingSong = "error!!!";
        return playingSong;
    }
    @Override
    public void show(Pane root) {
        Label nameOfPlayerLabel = new Label();
        nameOfPlayerLabel.setTranslateX(240);
        nameOfPlayerLabel.setTranslateY(10);
        nameOfPlayerLabel.setText("MP3 PLAYER #2");
        nameOfPlayerLabel.setFont(new Font("Courier New", 12));
        nameOfPlayerLabel.setTextFill(Paint.valueOf("#ff0000"));

        Label getPriceLabel = new Label();
        getPriceLabel.setTranslateX(180);
        getPriceLabel.setTranslateY(180);
        getPriceLabel.setText(Integer.toString(getPrice()) + "$");
        getPriceLabel.setFont(new Font("Courier New", 12));

        Label playOneSongLabel = new Label();
        playOneSongLabel.setTranslateX(180);
        playOneSongLabel.setTranslateY(210);
        playOneSongLabel.setText(playSong());
        playOneSongLabel.setFont(new Font("Courier New", 12));

        Button getPriceButton = new Button();
        getPriceButton.setTranslateX(20);
        getPriceButton.setTranslateY(180);
        getPriceButton.setPrefSize(150,20);
        getPriceButton.setText("Узнать цену плеера");

        Button playOneSongButton = new Button();
        playOneSongButton.setTranslateX(20);
        playOneSongButton.setTranslateY(210);
        playOneSongButton.setPrefSize(150,20);
        playOneSongButton.setText("Проиграть песню");

        getPriceButton.setOnMouseClicked(event -> {
            if (getPriceLabel != null) {
                root.getChildren().removeAll(getPriceLabel);
            }
            root.getChildren().addAll(getPriceLabel);

        });
        playOneSongButton.setOnMouseClicked(event -> {
            if (getPriceLabel != null) {
                root.getChildren().removeAll(playOneSongLabel);
            }
            root.getChildren().addAll(playOneSongLabel);
        });
        root.getChildren().addAll(nameOfPlayerLabel, getPriceButton, playOneSongButton);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
