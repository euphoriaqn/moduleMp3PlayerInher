package mp3player;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

/**
 * Created by user22 on 10.08.2017.
 */
public abstract class MainMp3 extends Application implements ISong {
    final int price;

    public MainMp3(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public abstract void show(Pane root);

    public String playSong() {
        String playingSong = "Playing " + song1;
        return playingSong;
    }

    public Label[] showView(Pane root, String playerName){
        Label nameOfPlayer = new Label();
        nameOfPlayer.setTranslateX(240);
        nameOfPlayer.setTranslateY(10);
        nameOfPlayer.setText(playerName);
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
        Label[] labels = {priceOfPlayer, playOneSong};
        return labels;
    }

 }
