public class OCharacterInterpreter implements MorseAlphabet {
    @Override
    public void interpreter(Context context) {
        if (context.getWordToMorse().contains("O")) {

            context.setResult(context.getResult() + "---");
        }
    }
}
