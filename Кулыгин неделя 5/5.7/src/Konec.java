public class Konec
{
    static void Vvod(int[] mas) {
        mas[0] = (int) (Math.random() * 90) + 10;
        for (int i = 1; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (100 - mas[i - 1])) + mas[i - 1];
        }
        Kon(mas);
    }
    static void Kon(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
