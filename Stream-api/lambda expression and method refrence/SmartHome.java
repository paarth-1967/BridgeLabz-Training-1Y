@FunctionalInterface
interface LightBehavior {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {

        // Motion detected
        LightBehavior motionLight = () -> 
            System.out.println("Lights ON - Motion detected");

        // Night mode
        LightBehavior nightLight = () -> 
            System.out.println("Dim Lights - Night mode");

        // Voice command
        LightBehavior voiceLight = () -> 
            System.out.println("Lights ON/OFF via voice command");

        // Execute behaviors
        motionLight.activate();
        nightLight.activate();
        voiceLight.activate();
    }
}