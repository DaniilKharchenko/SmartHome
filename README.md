# Smart Home Automation System — Facade Pattern

## Project description
This Java project demonstrates the Facade structural design pattern. The `SmartHomeFacade`
class gives the client simple commands for common routines. It coordinates six subsystems.

## Subsystem classes
- `LightSystem` — turns room lights on/off and adjusts brightness.
- `Thermostat` — sets a target temperature and ECO/COMFORT modes.
- `SmartLock` — locks and unlocks the front door.
- `SecurityAlarm` — activates and deactivates the alarm.
- `CurtainSystem` — opens and closes smart curtains.
- `EntertainmentSystem` — controls the TV and speakers.

## Facade commands
- `leaveHome()` — turns off entertainment and lights, closes curtains, sets ECO mode, locks the door, and activates the alarm.
- `arriveHome()` — deactivates the alarm, unlocks the door, turns on entrance lights, sets COMFORT mode, and opens curtains.
- `startMovieNight()` — closes curtains, dims living-room lights, sets 22°C, and starts the TV and speakers.
- `goodNight()` — turns off entertainment and lights, closes curtains, sets 19°C, locks the door, and activates the alarm.

## How to run
Open the project in IntelliJ IDEA and run `Main.java`.
Alternatively, run these commands from the source directory:
```bash
javac *.java
java Main
```

## Five Clean Code principles
1. **Meaningful names:** methods such as `startMovieNight()` and `setTemperature()` clearly describe their actions.
2. **Single Responsibility Principle:** each subsystem controls one feature; the facade coordinates routines.
3. **Encapsulation:** the client calls the facade and does not need subsystem implementation details.
4. **Small, focused classes:** every subsystem has a narrow, clear responsibility.
5. **Input validation:** the thermostat accepts temperatures only from 10 to 30°C, and brightness only from 0 to 100%.

## Pattern structure
`Main` is the client. It creates and uses only `SmartHomeFacade`; it does not instantiate or call subsystem classes directly. Subsystems do not reference the facade and can be used independently.
