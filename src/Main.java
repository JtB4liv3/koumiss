import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);

        //TIP ХОД ИГРЫ

        GU.clearScreen();
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
            String[] optmenu = {"Продолжить","Начать","Настройки","Компьютерное оси"};
            int menu = GU.colorChoise4(Arts.ART_LINES5,optmenu,true);
            if (menu==2) break;
            else {
                GU.clearScreen();
                GU.say("","Coming soon оси исун");
                GU.waitForInput();

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
//GU.text("",100);
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES0);
        GU.text("<< Однажды мужчина заключил с демоном сделку. \nОтдав половину уготованной ему жизни, он обрел дар слова.",100);
        GU.waitForInput();
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES0);
        GU.text("Текст из-под его пера запылал ярким пламенем гения. Слова собирались в сочные,\nвкусные фразы, а созданные его рукой декорации на бумаге превращались в завора-\nживающие локации. Сюжетные повороты захватывали дух.",100);
        GU.waitForInput();
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES0);
        GU.text("Творец писал, и миры его книг жили в сердцах многих людей.\n" +
                "" +
                "Жил он недолго, но на смертном одре писатель был счастлив, потому что у своего\nложа увидел талантливого художника и даровитого флейтиста - своих сыновей.",100);
        GU.waitForInput();
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES0);
        GU.text("Тем же теплым августовским вечером "+RED+"демон вынул душу из изуродованного проклятьем\nтела и пожрал ее, голодными глазами глядя на отпрысков мастера. >>"+RESET,100);

        GU.waitForInput();


        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES5);
        GU.say("Имя","Фраза");
        GU.waitForInput();

        // Пример с выбором действия
        GU.clearScreen();

        String[] optmenu = {"Сиси","Сисюлики","Писи","Писюлики"};
        int menu = GU.colorChoise4(Arts.ART_LINES5,optmenu,false);
    }

}
