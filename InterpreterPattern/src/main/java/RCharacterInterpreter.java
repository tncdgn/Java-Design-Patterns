public class RCharacterInterpreter implements MorseAlphabet {
    @Override
    public void interpreter(Context context) {
        if (context.getWordToMorse().contains("R")) {

            context.setResult(context.getResult() + ".-.");
        }
    }
}
