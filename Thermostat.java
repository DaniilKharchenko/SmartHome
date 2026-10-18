// Kharchenko Daniil
/**
 * Controls the target temperature and thermostat modes.
 */
public class Thermostat {
    private int targetTemperature = 21;
    private String mode = "COMFORT";

    public void setTemperature(int temperature) {
        if (temperature < 10 || temperature > 30) {
            System.out.println("Error: temperature must be between 10 and 30 degrees.");
            return;
        }
        targetTemperature = temperature;
        System.out.println("Thermostat set to " + targetTemperature + " degrees Celsius.");
    }

    public void setEcoMode() {
        mode = "ECO";
        targetTemperature = 18;
        System.out.println("Thermostat switched to ECO mode (" + targetTemperature + " degrees).");
    }

    public void setComfortMode() {
        mode = "COMFORT";
        targetTemperature = 21;
        System.out.println("Thermostat switched to COMFORT mode (" + targetTemperature + " degrees).");
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public String getMode() {
        return mode;
    }
}
