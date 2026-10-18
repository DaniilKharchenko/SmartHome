// Kharchenko Daniil
public class Main {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();

        System.out.println("========== SMART HOME SYSTEM ==========");

        System.out.println("\n--- 1. Leaving home ---");
        home.leaveHome();

        System.out.println("\n--- 2. Coming home ---");
        home.arriveHome();

        System.out.println("\n--- 3. Movie night ---");
        home.startMovieNight();

        System.out.println("\n--- 4. Good night ---");
        home.goodNight();
    }
}
