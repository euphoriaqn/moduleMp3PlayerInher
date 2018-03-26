package mp3player;

import javafx.scene.layout.Pane;
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
        showView(root, "MP3 PLAYER #2");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
