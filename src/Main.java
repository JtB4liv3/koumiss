import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);

        //TIP ХОД ИГРЫ

        GU.displayArt(Arts.WARNING_ART);
        scanner.nextLine();

        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES1);
        GU.sleep(300);
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES2);
        GU.sleep(300);
        GU.clearScreen();
        GU.displayColorArt(Arts.ART_LINES3,RED);
        GU.sleep(300);
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES4);
        GU.sleep(300);
        scanner.nextLine();

        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES5);
        GU.say("Имя","Фраза.");
        GU.waitForInput(scanner);

        // Пример с выбором действия
        GU.clearScreen();

        System.out.println(GU.colorChoise4(Arts.ART_LINES5,"сиси","сисечки","сисюлики","сисюндрики"));

        //String choice = scanner.nextLine();
    }

}
