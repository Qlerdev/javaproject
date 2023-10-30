package login.page;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound {
    private Clip clip;
    private boolean isPlaying = false;

    void playMusic(String musicLocation) {
        try {
            File musicPath = new File(musicLocation);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);

                if (isPlaying) {
                    clip.stop();
                    clip.close();
                    isPlaying = false;
                } else {
                    clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    isPlaying = true;
                }
            } else {
                System.out.println("Can't find file");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    void stopMusic(){
        if(clip != null && clip.isRunning()){
            clip.stop();
            clip.close();
            isPlaying = false;
        }
    }
}








