package mp3player;

import javafx.application.Application;
import javafx.scene.layout.Pane;
/**
 * Created by user22 on 10.08.2017.
 */
public abstract class MainMp3 extends Application implements ISong {
    String song1 = "The Best Song";
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


 }
