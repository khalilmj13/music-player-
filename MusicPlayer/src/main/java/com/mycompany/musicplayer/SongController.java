package com.mycompany.musicplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import com.mycompany.model.Song;
import java.io.File;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public class SongController {
    private Button addMusic;

    @FXML
    private ImageView mute;

    @FXML
    private ImageView nextmusic;

    @FXML
    private ImageView pause;

    @FXML
    private ImageView play;

    @FXML
    private ImageView previousmusic;

    @FXML
    private Slider volumecontroller;
    @FXML
    private Label artist;

    @FXML
    private ImageView img;

    @FXML
    private Label songName;
    public void setData(Song song){
      Image image;
      image = new Image(getClass().getResourceAsStream(song.getCover()));
      img.setImage(image);
      songName.setText(song.getSongName());
      artist.setText(song.getArtistName());
      img.setOnMouseClicked((MouseEvent event) -> {
       File file = new File(song.getPath());
       String path = file.getAbsolutePath().replace("\\", "/");  
       Media media = new Media(new File(path).toURI().toString());  
        MediaPlayer mediaplayer = new MediaPlayer(media);  
        mediaplayer.play();
      });
      
      
      
    }  
    
}
