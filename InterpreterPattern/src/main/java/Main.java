import java.util.List;

public class Main {

    public static void main(String[] args) {

        Context context = new Context("HELLOWORLD");

        List<MorseAlphabet> morseAlphabets = InterpreterCreator.createInterpreterList(context.getWordToMorse());

        morseAlphabets.forEach(morseAlphabet -> {
            morseAlphabet.interpreter(context);
        });

        System.out.println(context.getResult());
    }
}
