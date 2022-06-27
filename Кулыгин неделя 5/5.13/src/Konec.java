public class Konec
{
    static void Vvod(int[] mas, int[] mas1) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 21) - 10;
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        Kon(mas, mas1);
    }
    static void Kon(int[] mas, int[] mas1) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            for (int j = 0; j < mas1.length; j++) {
                System.out.print(mas1[j] + " ");
            }
        }
    }
}