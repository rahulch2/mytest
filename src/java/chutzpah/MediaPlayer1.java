/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutzpah;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.collections.MapChangeListener;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.media.Track;
import javafx.stage.Stage;

/**
 * A sample media player which loops indefinitely over the same video
 */
public class MediaPlayer1 extends Application {

    private static final String MEDIA_URL = "http://someserver/somedir/somefile.mp4";

    private static String arg1;

    public void start(Stage stage) {
        stage.setTitle("Media Player");

// Create media player
        Media media = new Media((arg1 != null) ? arg1 : MEDIA_URL);
        javafx.scene.media.MediaPlayer mediaPlayer = new javafx.scene.media.MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setCycleCount(javafx.scene.media.MediaPlayer.INDEFINITE);

// Print track and metadata information
        media.getTracks().addListener(new ListChangeListener<Track>() {
            public void onChanged(Change<? extends Track> change) {
                System.out.println("Track> " + change.getList());
            }
        });
        media.getMetadata().addListener(new MapChangeListener<String, Object>() {
            public void onChanged(MapChangeListener.Change<? extends String, ? extends Object> change) {
                System.out.println("Metadata> " + change.getKey() + " -> " + change.getValueAdded());
            }
        });

// Add media display node to the scene graph
        MediaView mediaView = new MediaView(mediaPlayer);
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);
        root.getChildren().add(mediaView);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            arg1 = args[0];
        }
        Application.launch(args);
    }
}
