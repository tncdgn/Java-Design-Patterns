import java.util.ArrayList;
import java.util.List;

public class InterpreterCreator {

    public static List<MorseAlphabet> createInterpreterList(String word) {
        List<MorseAlphabet> morseAlphabets = new ArrayList<MorseAlphabet>();
        for (char c : word.toCharArray()) {
            if (c == 'H') {
                morseAlphabets.add(new HCharacterInterpreter());
            }

            if (c == 'E') {
                morseAlphabets.add(new ECharacterInterpreter());
            }

            if (c == 'L') {
                morseAlphabets.add(new LCharacterInterpreter());
            }
            if (c == 'O') {
                morseAlphabets.add(new OCharacterInterpreter());
            }

            if (c == 'W') {
                morseAlphabets.add(new WCharacterInterpreter());
            }

            if (c == 'R') {
                morseAlphabets.add(new RCharacterInterpreter());
            }

            if (c == 'D') {
                morseAlphabets.add(new DCharacterInterpreter());
            }
        }

        return morseAlphabets;
    }
}