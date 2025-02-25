public class Main {
    public static void main(String[] args) {
        String line1 = "Hello Programming 2";
        String line2 = "Jhane Rose U. Sadicon";
        String line3 = "24-2038-129";

        int width = 120;
        System.out.println(center(line1, width));
        System.out.println(center(line2, width));
        System.out.println(center(line3, width));
    }

    public static String center(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }
}