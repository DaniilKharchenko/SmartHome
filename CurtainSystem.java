// Kharchenko Daniil
/**
 * Opens and closes the smart curtains.
 */
public class CurtainSystem {
    private boolean open;

    public void open() {
        open = true;
        System.out.println("Smart curtains opened.");
    }

    public void close() {
        open = false;
        System.out.println("Smart curtains closed.");
    }

    public boolean areOpen() {
        return open;
    }
}
