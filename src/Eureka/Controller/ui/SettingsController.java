package Eureka.Controller.ui;

import Eureka.models.SoundEffects;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SettingsController {
   
    @FXML 
    private AnchorPane settingsPane;
    @FXML
    private Button btn_back, btn_sound, btn_leaderboard, btn_profile;


    @FXML
    public void initialize() {
        // Add sound effects to buttons
        SoundEffects.addSound(btn_back);
        SoundEffects.addSound(btn_sound);
        SoundEffects.addSound(btn_leaderboard);
        SoundEffects.addSound(btn_profile);
        if (SoundEffects.isMuted()) {
            btn_sound.setText("Unmute");
        } else {
            btn_sound.setText("Mute");
        }
        
        // Initialize button actions
        setupBackButton();
        setupSoundButton();
        setupLeaderboardButton();
        setupProfileButton();
    }

 
    private void setupBackButton() {
        btn_back.setOnAction(event -> {
            SceneManager.changeScene(event, "LoggedIn.fxml");
        });
    }

    private void setupProfileButton() {
        btn_profile.setOnAction(event -> {
            SceneManager.changeScene(event, "Profile.fxml");
        });
    }

    private void setupSoundButton() {
        btn_sound.setOnAction(_ -> {
            SoundEffects.toggleMute();
            btn_sound.setText(SoundEffects.isMuted() ? "Unmute" : "Mute");
        });
    }

    private void setupLeaderboardButton() {
        btn_leaderboard.setOnAction(event -> {
            SceneManager.changeScene(event, "Leaderboard.fxml");
        });
    }

}
