public class ECharacterInterpreter implements MorseAlphabet {
    @Override
    public void interpreter(Context context) {
        if (context.getWordToMorse().contains("E")) {
            context.setResult(context.getResult() + ".");
        }
    }
}
