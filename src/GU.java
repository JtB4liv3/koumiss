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

    public static int colorChoise4(String[] art, String ch1, String ch2, String ch3, String ch4) throws IOException, InterruptedException {
        //хотел крч стрелочки организовать

        Scanner scanner = new Scanner(System.in);
        String pisun;
        while (true){
            //выводим арт, подсвечиваем выбор, ждем ввода, повторяем
            while(true){
                clearScreen();
                displayArt(art);
                System.out.println("\nx \u001B[31m"+ch1+"\u001B[0m"
                        +"\n- "+ch2
                        +"\n- "+ch3
                        +"\n- "+ch4);
                pisun=scanner.nextLine();
                if(pisun.equals(""));
                else if (pisun.equals(" "))return 1;
                clearScreen();
                displayArt(art);
                System.out.println("\n- "+ch1
                        +"\nx \u001B[31m"+ch2+"\u001B[0m"
                        +"\n- "+ch3
                        +"\n- "+ch4);
                pisun=scanner.nextLine();
                if(pisun.equals(""));
                else if (pisun.equals(" "))return 2;
                clearScreen();
                displayArt(art);
                System.out.println("\n- "+ch1
                        +"\n- "+ch2
                        +"\nx \u001B[31m"+ch3+"\u001B[0m"
                        +"\n- "+ch4);
                pisun=scanner.nextLine();
                if(pisun.equals(""));
                else if (pisun.equals(" "))return 3;
                clearScreen();
                displayArt(art);
                System.out.println("\n- "+ch1
                        +"\n- "+ch2
                        +"\n- "+ch3
                        +"\nx \u001B[31m"+ch4+"\u001B[0m");
                pisun=scanner.nextLine();
                if(pisun.equals(""));
                else if (pisun.equals(" "))return 4;
            }

        }
    }

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
