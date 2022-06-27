public class Konec
{
    static void Vvod(int[] mas, int num) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
        }
        Kon(mas, num);
    }
    static void Kon(int[] mas, int num) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length; j++) {
                if (mas[i] * mas[j] == num) {
                    System.out.print((i + 1) + ": " + mas[i] + " " +  (j + 1) + ": " + mas[j]);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Ппары элементов, произведение которых равно " + num + " в масиве не нашлось!");
        }
    }
}
