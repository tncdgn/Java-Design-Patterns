public class YellowLight implements LightState {
    public void changeLightColor(LightContext lightContext) {
        lightContext.setLightState(new GreenLight());
        printCurrentColor();
    }

    public void printCurrentColor() {
        System.out.println("Current color is yellow");
    }
}
