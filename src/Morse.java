import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by william on 2017-02-17.
 */

/**
 * Class to represent a morse object
 */
public class Morse {
    private String morse;
    private int length;

    public Morse(String morse, int length) {
        this.morse = morse;
        this.length = length;
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
}
