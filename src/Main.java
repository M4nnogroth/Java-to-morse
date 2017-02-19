/**
 * Created by william on 2016-11-01.
 */

public class Main{
    private static Parser newparse = new Parser();

    public static void main(String[] args) throws InterruptedException {
        newparse.parse_audio(newparse.multiparse_morse(args[0]));

        System.out.println(args[0]);
        System.out.println(newparse.multiparse_morse(args[0]));

    }

}
