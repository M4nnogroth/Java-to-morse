import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Parser {



    /**
     * Parses a string instead of char
     * @param input String
     * @return a string with the same content as parse_morse.
     * This method can also handle whitespace
     */
    public String multiparse_morse(String input) {
        String result = "";
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == ' ') {
                result+="/";
            }
            else {
                result+=parse_morse(input.charAt(i));
            }
        }
        return result;
    }

    /**
     * TODO change input to morse datatype instead of String
     * @param input String representing morse characters
     * @throws InterruptedException
     */
    public void parse_audio(String input) throws InterruptedException {
        for (int i=0; i<input.length(); i++) {
            switch (input.charAt(i)) {
                case '.':
                    PlaySound.playShort();
                    break;
                case '-':
                    PlaySound.playLong();
                    break;
                case '/':
                    Thread.sleep(500);
            }

        }
    }
}
