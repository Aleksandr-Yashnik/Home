public class Rgb {
    public static String rgb(int r, int g, int b) {
        // Ограничиваем значения r, g, b диапазоном от 0 до 255
        r = Math.min(Math.max(r, 0), 255);
        g = Math.min(Math.max(g, 0), 255);
        b = Math.min(Math.max(b, 0), 255);

        // Преобразуем каждое значение в шестнадцатеричную строку с двумя символами
        String hexR = Integer.toHexString(r);
        String hexG = Integer.toHexString(g);
        String hexB = Integer.toHexString(b);

        // Дополняем каждую строку нулями до двух символов, если необходимо
        hexR = hexR.length() < 2 ? "0" + hexR : hexR;
        hexG = hexG.length() < 2 ? "0" + hexG : hexG;
        hexB = hexB.length() < 2 ? "0" + hexB : hexB;

        // Объединяем строки для получения окончательного шестнадцатеричного представления
        return hexR + hexG + hexB;
    }

    public static void main(String[] args) {
        // Примеры использования метода rgb
        System.out.println(rgb(255, 255, 255)); // Ожидаемый вывод: "FFFFFF"
        System.out.println(rgb(255, 255, 300)); // Ожидаемый вывод: "FFFFFF"
        System.out.println(rgb(0, 0, 0));       // Ожидаемый вывод: "000000"
        System.out.println(rgb(148, 0, 211));   // Ожидаемый вывод: "9400D3"
    }
}
