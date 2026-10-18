// Kharchenko Daniil
/**
 * Controls the smart door lock.
 */
public class SmartLock {
    private boolean locked = true;

    public void lock() {
        locked = true;
        System.out.println("Front door is locked.");
    }

    public void unlock() {
        locked = false;
        System.out.println("Front door is unlocked.");
    }

    public boolean isLocked() {
        return locked;
    }
}
