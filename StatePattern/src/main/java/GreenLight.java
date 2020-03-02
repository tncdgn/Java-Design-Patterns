public class GreenLight implements LightState {

    public void changeLightColor(LightContext lightContext) {
        lightContext.setLightState(new RedLight());
        printCurrentColor();
    }

    public void printCurrentColor() {
        System.out.println("Current color is green");
    }
}
