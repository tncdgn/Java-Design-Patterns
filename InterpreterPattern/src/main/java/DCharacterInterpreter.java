public class DCharacterInterpreter implements MorseAlphabet {
    @Override
    public void interpreter(Context context) {
        if (context.getWordToMorse().contains("D")) {

            context.setResult(context.getResult() + "-..");
        }
    }
}
