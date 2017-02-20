import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class to represent a morse object and encode a string into morse
 */
public class Morse {
    private String morse;
    private int length;

    /**
     * Constructor for Morse class
     * @param morse String representing morse (. -)
     */
    public Morse(String morse) {
        this.morse = multiparse_morse(morse);
        this.length = this.morse.length();
    }

    public String getString() {
        return this.morse;
    }

    public int getLength() {
        return this.length;
    }

    /**
     * parses input char to morse
     * @param input char
     * @return a series of . and - representing short and long
     **/
    private String parse_morse(char input) {
        String result = "";
        String line;
        input = Character.toUpperCase(input);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("morse.txt"));
            while((line = reader.readLine()) != null) {
                if (line.charAt(0) == input) {
                    for (int i=1; i < line.length(); i++) {
                        result += line.charAt(i);
                    }
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Parses a string instead of char
     * @param input String
     * @return String parsed to morse
     * This method can also handle whitespace
     */
    private String multiparse_morse(String input) {
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
     * Parses given morse object to a series of beeps
     * @throws InterruptedException
     */
    public void parse_audio() throws InterruptedException {
        PlaySound sound = new PlaySound();
        for (int i = 0; i < this.getLength(); i++) {
            switch (this.getString().charAt(i)) {
                case '.':
                    sound.playShort();
                    break;
                case '-':
                    sound.playLong();
                    break;
                case '/':
                    Thread.sleep(500);
            }

        }
    }
}
