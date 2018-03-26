package mp3player;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
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
        labe = new Label[playlist.length];
        for (int i = playlist.length-1; i>=0; i--){
           drawLabels(i);
        }
    }

    @Override
    public void show(Pane root) {
       Label[] labels = showView(root, "MP3 PLAYER #5");
       showViewManyFunctional(root, labels);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
