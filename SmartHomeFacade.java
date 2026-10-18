// Kharchenko Daniil
/**
 * Facade provides simple commands for common smart-home routines.
 * It coordinates subsystem objects and hides their implementation details.
 */
public class SmartHomeFacade {
    private final LightSystem lights;
    private final Thermostat thermostat;
    private final SmartLock smartLock;
    private final SecurityAlarm securityAlarm;
    private final CurtainSystem curtains;
    private final EntertainmentSystem entertainment;

    public SmartHomeFacade() {
        lights = new LightSystem();
        thermostat = new Thermostat();
        smartLock = new SmartLock();
        securityAlarm = new SecurityAlarm();
        curtains = new CurtainSystem();
        entertainment = new EntertainmentSystem();
    }

    public void leaveHome() {
        System.out.println("Preparing the home for an empty house...");
        entertainment.turnOff();
        lights.turnOffAll();
        curtains.close();
        thermostat.setEcoMode();
        smartLock.lock();
        securityAlarm.activate();
    }

    public void arriveHome() {
        System.out.println("Preparing the home for the owner's arrival...");
        securityAlarm.deactivate();
        smartLock.unlock();
        lights.turnOn("Entrance");
        thermostat.setComfortMode();
        curtains.open();
    }

    public void startMovieNight() {
        System.out.println("Preparing the living room for a movie...");
        curtains.close();
        lights.setBrightness("Living room", 20);
        thermostat.setTemperature(22);
        entertainment.startMovieMode();
    }

    public void goodNight() {
        System.out.println("Setting the home to night mode...");
        entertainment.turnOff();
        lights.turnOffAll();
        curtains.close();
        thermostat.setTemperature(19);
        smartLock.lock();
        securityAlarm.activate();
    }
}
