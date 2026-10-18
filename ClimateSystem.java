// Kharchenko Daniil
/**
 * Controls the home's temperature and energy-saving mode.
 */
public class ClimateSystem {
    public void setTemperature(int temperature) {
        if (temperature < 10 || temperature > 30) {
            System.out.println("Error: temperature must be between 10 and 30 degrees.");
            return;
        }
        System.out.println("Temperature set to " + temperature + " degrees.");
    }

    public void setEcoMode() {
        System.out.println("Climate system is in ECO mode.");
    }

    public void setComfortMode() {
        System.out.println("Climate system is in COMFORT mode.");
    }
}
