import java.io.IOException;
import java.util.Scanner;

public class GU {

    public static final String RESET = "\u001B[0m";

    /*todo:
    *  центрирование текста
    *  текст с рамочкой
    *  цветные рисунки, окрашенные элементы GUI и тд
    *  анимации вывода текста
    *  определить размеры экрана*/ //цели

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printWithDelay(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            sleep(delay);
        }
        System.out.println();
    }

    public static void say(String name, String text){
        System.out.println("\n\n\t\t\t"+name+":");
        printWithDelay("\t— "+text,200);
    }

    public static void waitForInput(Scanner scanner) {
        System.out.println("\n                                                      - Enter чтобы продолжить -");
        scanner.nextLine();
    }

    // Метод для отображения рисунка
    public static void displayArt(String[] art) {
        for (String line : art) {
            System.out.println(line);
        }
    }

    public static void displayColorArt(String[] art, String color){
        for (String line : art) {
            System.out.println(color+line+RESET);
        }
    }

    // Метод для очистки экрана
    public static void clearScreen() throws IOException, InterruptedException {
        /*for (int i = 0; i < 30; i++) {
            System.out.println();
        }*/
        /*System.out.print("\033[H\033[2J");
        System.out.flush();*/
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
