public class RedLight implements LightState {
    public void changeLightColor(LightContext lightContext) {
        lightContext.setLightState(new YellowLight());
        printCurrentColor();
    }

    public void printCurrentColor() {
        System.out.println("Current color is red");
    }
}
