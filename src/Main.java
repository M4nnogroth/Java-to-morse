import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by william on 2016-11-01.
 */

public class Main{

    public static void main(String[] args) throws InterruptedException {
        Parser.parse_audio(Parser.multiparse_morse(args[0]));
    }

}
