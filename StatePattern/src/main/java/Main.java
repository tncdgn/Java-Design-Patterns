public class Main {
    public static void main(String[] args) {
        LightContext lightContext = new LightContext(new GreenLight());

        lightContext.pullString();
        lightContext.pullString();
        lightContext.pullString();

        lightContext.pullString();
        lightContext.pullString();
        lightContext.pullString();
    }
}
