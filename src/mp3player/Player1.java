package mp3player;

import javafx.scene.layout.Pane;
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

        showView(root, "MP3 PLAYER #1");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
