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
        Label[] labels = showView(root,  "MP3 PLAYER #6");
        showViewManyFunctional(root, labels);

        Button shuffleButton = new Button();
        shuffleButton.setTranslateX(20);
        shuffleButton.setTranslateY(300);
        shuffleButton.setPrefSize(150,20);
        shuffleButton.setText("Перемешать песни");

        shuffleButton.setOnMouseClicked(event -> {
            shuffle();
        });
        root.getChildren().addAll(shuffleButton);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
