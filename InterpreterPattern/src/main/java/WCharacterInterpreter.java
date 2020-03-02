public class WCharacterInterpreter implements MorseAlphabet {
    @Override
    public void interpreter(Context context) {
        if (context.getWordToMorse().contains("W")) {

            context.setResult(context.getResult() + ".--");
        }
    }
}
