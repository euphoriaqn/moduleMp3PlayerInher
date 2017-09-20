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
public class Player5 extends ManyFunctionalPlayer{
    public Player5(int price) {
        super(price);
        System.out.println("Объект Player5 создан");
    }

    @Override
    public String playSong() {
        String playingSong = "Playing " + playlist[0];
        return playingSong;
    }
    public void playAllSongs(){
        int xPos = 240;
        labe = new Label[playlist.length];
        for (int i = playlist.length-1; i>=0; i--){
            labe[i] = new Label();
            labe[i].setTranslateX(180);
            labe[i].setTranslateY(xPos);
            xPos = xPos +30;
            labe[i].setText(playlist[i]);
            labe[i].setFont(new Font("Courier New", 12));
        }
    }
    @Override
    public void show(Pane root) {
        Label playerNameLabel = new Label();
        playerNameLabel.setTranslateX(240);
        playerNameLabel.setTranslateY(10);
        playerNameLabel.setText("MP3 PLAYER #5");
        playerNameLabel.setFont(new Font("Courier New", 12));
        playerNameLabel.setTextFill(Paint.valueOf("#ff0000"));

        Label playerPriceLabel = new Label();
        playerPriceLabel.setTranslateX(180);
        playerPriceLabel.setTranslateY(180);
        playerPriceLabel.setText(Integer.toString(getPrice()) + "$");
        playerPriceLabel.setFont(new Font("Courier New", 12));

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

        Button playPlaylistButton = new Button();
        playPlaylistButton.setTranslateX(20);
        playPlaylistButton.setTranslateY(240);
        playPlaylistButton.setPrefSize(150,20);
        playPlaylistButton.setText("Проиграть плейлист");

        Button clearAllFieldsButton = new Button();
        clearAllFieldsButton.setTranslateX(20);
        clearAllFieldsButton.setTranslateY(270);
        clearAllFieldsButton.setPrefSize(150,20);
        clearAllFieldsButton.setText("Очистить все поля");

        getPriceButton.setOnMouseClicked(event -> {
            if (playerPriceLabel != null) {
                root.getChildren().removeAll(playerPriceLabel);
            }
            root.getChildren().addAll(playerPriceLabel);

        });
        playOneSongButton.setOnMouseClicked(event -> {
            if (playOneSongLabel != null) {
                root.getChildren().removeAll(playOneSongLabel);
            }
            root.getChildren().addAll(playOneSongLabel);
        });
        playPlaylistButton.setOnMouseClicked(event -> {
            if (labe != null && labe.length > 0) {
                root.getChildren().removeAll(labe);
            }
            playAllSongs();
            root.getChildren().addAll(labe);

        });
        clearAllFieldsButton.setOnMouseClicked(event -> {
            if (labe != null && labe.length > 0) {
                root.getChildren().removeAll(labe);
            }
            root.getChildren().removeAll(playerPriceLabel, playOneSongLabel);
        });
        root.getChildren().addAll(playerNameLabel, getPriceButton, playOneSongButton, playPlaylistButton,clearAllFieldsButton);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
