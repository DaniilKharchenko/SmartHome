// Kharchenko Daniil
/**
 * Activates or deactivates the home's security alarm.
 */
public class SecurityAlarm {
    private boolean active;

    public void activate() {
        active = true;
        System.out.println("Security alarm ACTIVATED.");
    }

    public void deactivate() {
        active = false;
        System.out.println("Security alarm DEACTIVATED.");
    }

    public boolean isActive() {
        return active;
    }
}
