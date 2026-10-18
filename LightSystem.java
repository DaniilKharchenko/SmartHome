// Kharchenko Daniil
/**
 * Controls lights in different rooms.
 */
public class LightSystem {
    public void turnOn(String room) {
        System.out.println("Light in " + room + " turned ON.");
    }

    public void turnOffAll() {
        System.out.println("All lights turned OFF.");
    }

    public void setBrightness(String room, int percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Error: brightness must be between 0 and 100.");
            return;
        }
        System.out.println("Brightness in " + room + " set to " + percent + "%.");
    }
}
