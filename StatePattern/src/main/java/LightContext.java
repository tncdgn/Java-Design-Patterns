public class LightContext {

    private LightState lightState;

    public LightContext(LightState firstState) {
        this.lightState = firstState;
    }

    public LightState getLightState() {
        return lightState;
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }

    public void pullString() {
        lightState.changeLightColor(this);
    }
}
