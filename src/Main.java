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

        //menu
        while(true){
            int menu = GU.colorChoise4(Arts.ART_LINES5,"Продолжить","Начать","Настройки","Компьютерное соси");
            if (menu==2) break;
            else {
                GU.clearScreen();
                GU.say("","Coming soon соси писун");
                GU.waitForInput(scanner);

            }

        }
        startBranch1();
        /*int menu = GU.colorChoise4(Arts.ART_LINES5,"Продолжить","Начать","","");
        if (menu==2) startBranch1();
        else {
            GU.clearScreen();
            GU.say("","Coming soon соси писун");
            GU.waitForInput(scanner);
            startBranch1();
        }*/



    }

    public static void startBranch1() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES5);
        GU.say("Имя","Фраза");
        GU.waitForInput(scanner);

        // Пример с выбором действия
        GU.clearScreen();

        System.out.println(GU.colorChoise4(Arts.ART_LINES5,"сиси","сисечки","сисюлики","сисюндрики"));
    }

}
