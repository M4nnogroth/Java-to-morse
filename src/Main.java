/**
 * Created by william on 2016-11-01.
 */

public class Main{

    public static void main(String[] args) throws InterruptedException {
        Parser.parse_audio(Parser.multiparse_morse(args[0]));
    }

}
