package mp3player;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player6 extends ManyFunctionalPlayer{
    public Player6(int price) {
        super(price);
        System.out.println("Об'єкт Player6 создан");
    }
    public void shuffle(){
        Random rnd = new Random();
        for (int i = playlist.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String tmp = playlist[index];
            playlist[index] = playlist[i];
            playlist[i] = tmp;
        }
    }
    @Override
    public String playSong() {
        String playingSong = "Playing " + playlist[0];
        return playingSong;
    }
    @Override
    public void show(Pane root) {
        Label playerNameLabel = new Label();
        playerNameLabel.setTranslateX(240);
        playerNameLabel.setTranslateY(10);
        playerNameLabel.setText("MP3 PLAYER #6");
        playerNameLabel.setFont(new Font("Courier New", 12));
        playerNameLabel.setTextFill(Paint.valueOf("#ff0000"));

        Label playerPricelabel = new Label();
        playerPricelabel.setTranslateX(180);
        playerPricelabel.setTranslateY(180);
        playerPricelabel.setText(Integer.toString(getPrice()) + "$");
        playerPricelabel.setFont(new Font("Courier New", 12));

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

        Button shuffleButton = new Button();
        shuffleButton.setTranslateX(20);
        shuffleButton.setTranslateY(300);
        shuffleButton.setPrefSize(150,20);
        shuffleButton.setText("Перемешать песни");


        getPriceButton.setOnMouseClicked(event -> {
            if (playerPricelabel != null) {
                root.getChildren().removeAll(playerPricelabel);
            }
            root.getChildren().addAll(playerPricelabel);

        });
        playOneSongButton.setOnMouseClicked(event -> {
            if (playerPricelabel != null) {
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
            root.getChildren().removeAll(playerPricelabel, playOneSongLabel);
        });
        shuffleButton.setOnMouseClicked(event -> {
            shuffle();
        });
        root.getChildren().addAll(playerNameLabel, getPriceButton, playOneSongButton,playPlaylistButton,clearAllFieldsButton,shuffleButton);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

    }
    public void playAllSongs() {
        int xPos = 240;
        labe = new Label[playlist.length];
        for (int i = 0; i <= (playlist.length-1); i++){
            labe[i] = new Label();
            labe[i].setTranslateX(180);
            labe[i].setTranslateY(xPos);
            xPos = xPos +30;
            labe[i].setText(playlist[i]);
            labe[i].setFont(new Font("Courier New", 12));
        }
    }
}
