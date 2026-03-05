import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);

        GU.clearScreen();
        GU.displayArt(Arts.WARNING_ART);
        scanner.nextLine();

        //анимация
        //todo: урезать арты
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES1);
        GU.sleep(300);
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES2);
        GU.sleep(300);
        GU.clearScreen();
        GU.displayColorArt(Arts.ART_LINES3, RED);
        GU.sleep(300);
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES4);
        GU.sleep(300);
        scanner.nextLine();

        openmenu();
    }

    //todo: добавить разделов
    public static void openmenu() throws IOException, InterruptedException {
        boolean game=true;
        while(game==true){
            String[] optmenu = {"Продолжить","Начать","Настройки","Выход"};
            int menu = GU.colorChoise4(optmenu,true);
            switch (menu){
                case 1:
                    GU.comingsoon();
                    break;
                case 2:
                    startBranch1();
                    break;
                case 3:
                    openSettings();
                    break;
                case 4:
                    game=false;
                    break;
            }
        }
    }

    //todo: добавить разделов
    public static void openSettings() throws IOException, InterruptedException {
        boolean settings = true;
        while(settings==true){
            GU.clearScreen();
            String[] optionsmenu ={"Скорость текста","не доделал","не доделал","Назад"};
            int choose=GU.colorChoise4(optionsmenu,false);
            switch (choose){
                case 1:
                    GU.clearScreen();
                    String[] textspeedopt={"мега вич","супер спид","губка боб","суефа"};
                    GU.textspeed=GU.colorChoise4(textspeedopt, false);
                    break;
                case 2:
                    GU.comingsoon();
                    break;
                case 3:
                    GU.comingsoon();
                    break;
                case 4:
                    settings=false;
                    openmenu();
                    break;
            }
        }
    }

    public static void startBranch1() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
//GU.text("",100);
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES0);
        GU.text("<< Однажды мужчина заключил с демоном сделку. \nОтдав половину уготованной ему жизни, он обрел дар слова.");
        GU.waitForInput();
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES0);
        GU.text("Текст из-под его пера запылал ярким пламенем гения. Слова собирались в сочные,\nвкусные фразы, а созданные его рукой декорации на бумаге превращались в завора-\nживающие локации. Сюжетные повороты захватывали дух.");
        GU.waitForInput();
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES0);
        GU.text("Творец писал, и миры его книг жили в сердцах многих людей.\nЖил он недолго, но на смертном одре писатель был счастлив, потому что у своего\nложа увидел талантливого художника и даровитого флейтиста - своих сыновей.");
        GU.waitForInput();
        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES0);
        GU.text("Тем же теплым августовским вечером "+RED+"демон вынул душу из изуродованного проклятьем\nтела и пожрал ее, голодными глазами глядя на отпрысков мастера. >>"+RESET);

        GU.waitForInput();


        GU.clearScreen();
        GU.displayArt(Arts.ART_LINES5);
        GU.say("Имя","Фраза");
        GU.waitForInput();

        // Пример с выбором действия
        GU.clearScreen();

        String[] optmenu = {"Сиси","Сисюлики","Писи","Писюлики"};
        int menu = GU.colorChoise4(optmenu,false);
    }
}
