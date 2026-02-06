public class GU {

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
}
