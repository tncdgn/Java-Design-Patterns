public class Context {

    private String wordToMorse;
    private String result = "";

    public Context(String wordToMorse) {
        this.wordToMorse = wordToMorse;
    }

    public String getWordToMorse() {
        return wordToMorse;
    }

    public void setWordToMorse(String wordToMorse) {
        this.wordToMorse = wordToMorse;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
