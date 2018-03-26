package mp3player;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by user22 on 10.08.2017.
 */
public class Player3 extends ManyFunctionalPlayer{
    public Player3(int price) {
        super(price);
        System.out.println("Об'єкт Player3 создан ");
    }
    @Override
    public String playSong() {
        String playingSong = "Playing " + playlist[0];
        return playingSong;
    }
    @Override
    public void show(Pane root) {
        Label[] labels = showView(root, "MP3 PLAYER #3");
        showViewManyFunctional(root, labels);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    }
