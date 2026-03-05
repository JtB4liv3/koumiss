import java.io.IOException;
import java.util.Scanner;

public class GU {
    public static int textspeed=2;
    public static final String RESET = "\u001B[0m";

    /*todo:
    *  центрирование текста
    *  текст с рамочкой
    *  анимации вывода текста
    *  определить размеры экрана*/ //цели

    public static int colorChoise4(/*String[] art, */String[] choices,boolean help) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int selected = 0;  // Индекс выбранного варианта

        while (true) {
            // Очищаем экран и показываем арт
            clearScreen();
            //displayArt(art);
            System.out.println();
            // Выводим все варианты с подсветкой текущего
            for (int i = 0; i < choices.length; i++) {
                if (i == selected) {
                    System.out.println("x \u001B[31m" + choices[i] + "\u001B[0m");
                } else {
                    System.out.println("- " + choices[i]);
                }
            }
            if(help==true)System.out.println("\nДальше [enter] / Выбор [spase + enter]");
            // Ждем ввод
            String input = scanner.nextLine();

            if (input.equals("")) {
                // Enter - листаем вперед
                selected = (selected + 1) % choices.length;
            }
            else if (input.equals(" ")) {
                // Пробел - подтверждаем выбор
                return selected + 1; // Возвращаем 1..N
            }
            // Любой другой ввод игнорируем
        }
    }

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printWithDelay(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            sleep(textspeed*50);
        }
        System.out.println();
    }

    public static void say(String name, String text){
        System.out.println("\n\n\t\t\t"+name+":");
        printWithDelay("\t- "+text+".");
    }

    public static void text(String text){
        /*int count = 0;*/
        System.out.println();
        for(char c : text.toCharArray()){
            System.out.print(c);
            System.out.flush();
            sleep(textspeed*50);
            //count++;
            /*if(count==80){
                System.out.print("\n");
                count=0;
            }*/
        }

    }

    public static void waitForInput() {
        Scanner scanner = new Scanner(System.in);
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

    public static void comingsoon() throws IOException, InterruptedException {
        GU.clearScreen();
        GU.say("","Coming soon оси исун");
        GU.waitForInput();
    }

    public static void save(){

    }
    public static void load(){

    }
}
