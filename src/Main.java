import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Created by william on 2016-11-01.
 */

public class Main {
    static int shortStop = 170;
    static int longStop = 280;

    static Clip shortclip;
    static Clip longclip;

    public static void playShort() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("short.wav").getAbsoluteFile());
            shortclip = AudioSystem.getClip();
            shortclip.open(audioInputStream);
            shortclip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public static void playLong() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("long.wav").getAbsoluteFile());
            longclip = AudioSystem.getClip();
            longclip.open(audioInputStream);
            longclip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        playShort();
        Thread.sleep(shortStop);
        playShort();
        Thread.sleep(shortStop);
        playShort();
        Thread.sleep(longStop);

        playLong();
        Thread.sleep(longStop);
        playLong();
        Thread.sleep(longStop);
        playLong();
        Thread.sleep(longStop);

        playShort();
        Thread.sleep(shortStop);
        playShort();
        Thread.sleep(shortStop);
        playShort();
        Thread.sleep(shortStop);
    }
}
