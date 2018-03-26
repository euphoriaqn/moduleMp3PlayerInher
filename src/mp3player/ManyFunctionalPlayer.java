package mp3player;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

/**
 * Created by Илья on 14.08.2017.
 */
public abstract class ManyFunctionalPlayer extends MainMp3 {
    protected int xPos = 240;
    protected Label[] labe;
    protected String[] playlist = new String[]{song1, "Good song", "Super Song" };
    public ManyFunctionalPlayer(int price) {
        super(price);
    }
    public void playAllSongs() {
        labe = new Label[playlist.length];
        for (int i = 0; i <= (playlist.length-1); i++){
            drawLabels(i);
        }
        xPos = 240;
    }
    public void drawLabels(int i){
        labe[i] = new Label();
        labe[i].setTranslateX(180);
        labe[i].setTranslateY(xPos);
        xPos = xPos +30;
        labe[i].setText(playlist[i]);
        labe[i].setFont(new Font("Courier New", 12));
    }
    public void showViewManyFunctional(Pane root, Label[] labels){
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
            root.getChildren().removeAll(labels);
            xPos = 240;
        });
        root.getChildren().addAll(playPlaylistButton,clearAllFieldsButton);
    }
}
