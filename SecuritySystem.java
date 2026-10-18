// Kharchenko Daniil
/**
 * Controls the home alarm system.
 */
public class SecuritySystem {
    private boolean alarmActive;

    public void activateAlarm() {
        alarmActive = true;
        System.out.println("Security alarm activated.");
    }

    public void deactivateAlarm() {
        alarmActive = false;
        System.out.println("Security alarm deactivated.");
    }

    public boolean isAlarmActive() {
        return alarmActive;
    }
}
