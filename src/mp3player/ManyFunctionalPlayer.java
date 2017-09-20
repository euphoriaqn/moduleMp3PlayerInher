package mp3player;

import javafx.scene.control.Label;

/**
 * Created by Илья on 14.08.2017.
 */
public abstract class ManyFunctionalPlayer extends MainMp3 {
    protected Label[] labe;
    protected String[] playlist = new String[]{song1, "Good song", "Super Song" };
    public ManyFunctionalPlayer(int price) {
        super(price);
    }
    public void playAllSongs() {
        for (String songCount : playlist){

            System.out.println("Playing " + songCount);
        }
    }
}
