public class LCharacterInterpreter implements MorseAlphabet {
    @Override
    public void interpreter(Context context) {
        if (context.getWordToMorse().contains("L")) {

            context.setResult(context.getResult() + ".-..");
        }
    }
}
