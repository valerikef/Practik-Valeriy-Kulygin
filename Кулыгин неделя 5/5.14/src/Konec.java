public class Konec
{
    static void Vvod(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int[] mas1 = new int[mas.length / 2];
        int j = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) {
                mas1[j] = mas[i];
                j++;
            } else {
                continue;
            }
        }
        Kon(mas1);
    }
    static void Kon(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            }
        }
}
