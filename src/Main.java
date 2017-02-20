/**
 * Created by william on 2016-11-01.
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Create new morse object
        Morse textToMorse = new Morse(args[0]);

        //print result and parse to audio
        System.out.println(textToMorse.getString());
        textToMorse.parse_audio();
    }

}
