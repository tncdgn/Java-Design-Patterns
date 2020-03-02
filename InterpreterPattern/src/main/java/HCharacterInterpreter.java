public class HCharacterInterpreter implements MorseAlphabet {

    public void interpreter(Context context) {
        if (context.getWordToMorse().contains("H")) {

            context.setResult(context.getResult() + "....");
        }
    }
}
