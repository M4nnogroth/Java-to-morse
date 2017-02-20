import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * contains methods for playing beeps
 */
public class PlaySound {

    private final int shortStop = 180;
    private final int longStop = 300;

    private Clip shortclip;
    private Clip longclip;

    /**
     * Plays a short beep
     */
    public void playShort() {
        try {
            AudioInputStream ShortInputStream = AudioSystem.getAudioInputStream(new File("short.wav").getAbsoluteFile());
            shortclip = AudioSystem.getClip();
            shortclip.open(ShortInputStream);
            shortclip.start();
            Thread.sleep(shortStop);
            shortclip.close();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Plays a long beep
     */
    public void playLong() {
        try {
            AudioInputStream LongInputStream = AudioSystem.getAudioInputStream(new File("long.wav").getAbsoluteFile());
            longclip = AudioSystem.getClip();
            longclip.open(LongInputStream);
            longclip.start();
            Thread.sleep(longStop);
            longclip.close();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
