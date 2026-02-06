import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);


        /*
        Arts.clearScreen(); - очистить экран
        Arts.displayArt(Arts.НазваниеРисунка); - отобразить рисунок
        waitForInput(scanner); - ждать нажатия + сообщение
        GU.sleep(миллисекунды); - ждать время
        scanner.nextLine(); - тоже ждать нажатия хз
        GU.printWithDelay(текст, мс);
        */ //функции

        /*todo:
           - ветка сюжета = класс, на будущее. Изучить движки, рассмотреть правильную архитектуру.
           - вынести игровую цепочку нахуй отсюдава.
           - поговорить о сюжете. Обсудить главную мысль (что мы хотим донести, как мы это сделаем, при помощи чего, через что).
           - после определения сеттинга определить гг, его цель на протяжении всей игры (сюжет должен иметь направление, а получится ли хороший конец - хз).
           - дополнить список фунций: определить, какими будем пользоваться, добавить в GU.
           - добавить парней в репозиторий.
           - пакеты добавить.

          настроить гит*/ //цели


        //TIP ХОД ИГРЫ

        System.out.println("\n\ngame by JtB4liv3\n\tfck u<3");

        //анимация
        Arts.displayArt(Arts.ART_LINES1);
        GU.sleep(500);
        Arts.displayArt(Arts.ART_LINES2);
        GU.sleep(500);
        Arts.displayArt(Arts.ART_LINES3);
        GU.sleep(500);
        Arts.displayArt(Arts.ART_LINES4);
        GU.sleep(500);
        scanner.nextLine();

        Arts.clearScreen();
        GU.printWithDelay("\t\t\t\tшкибиди доп доп доп ес ес",250);
        waitForInput(scanner);

        // Пример с выбором действия
        Arts.clearScreen();
        System.out.println("\nЧто будете делать?");
        System.out.println("1. Осмотреться вокруг");
        System.out.println("2. Проверить инвентарь");
        System.out.println("3. Попробовать вернуться");

        String choice = scanner.nextLine();
        handleChoice(choice);
    }

    private static void waitForInput(Scanner scanner) {
        System.out.println("\n                                                      - Enter чтобы продолжить -");
        scanner.nextLine();
    }

    private static void handleChoice(String choice) {
        Arts.clearScreen();

        switch (choice) {
            case "1":
                Arts.displayArt(Arts.ART_LINES2);
                System.out.println("\n🔍 Вы внимательно осматриваете местность...");
                break;
            case "2":
                Arts.displayArt(Arts.ART_LINES3);
                System.out.println("\n🎒 В инвентаре: карта, фляга, амулет");
                break;
            case "3":
                Arts.displayArt(Arts.ART_LINES1);
                System.out.println("\n🌀 Портал исчез... возврата нет!");
                break;
            default:
                Arts.displayArt(Arts.ART_LINES4);
                System.out.println("\n❓ Непонятный выбор...");
        }
    }
}
