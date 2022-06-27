public class Konec
{
    static void Vvod(int[] mas, int r) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 11);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        Kon(mas, r);
    }
    static void Kon(int[] mas, int r) {
        int x, y, count = 0;
        for (int i = 0; i < mas.length; i += 2) {
            x = mas[i];
            y = mas[i + 1];
            if ((x * x + y * y) == r * r) {
                System.out.println("Точка " + (i / 2 + 1) + " с координатами (" + mas[i] + "; " + mas[i + 1] + ") лежит на окружности");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ни одна точка, на окружности не лежит");
        }
    }
}
