public class SensorDataLogger {

    public static void logTemp(Double temp) {
        System.out.println("Temperature: " + temp);
    }

    public static void main(String[] args) {
        logTemp(25.5);  // primitive → auto-boxing
        Double t = 30.0;
        logTemp(t);     // wrapper
    }
}