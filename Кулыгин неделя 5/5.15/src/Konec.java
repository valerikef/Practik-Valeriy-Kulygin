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
        int[] mas2 = new int[Math.max(mas.length, mas1.length)];
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            int count = 0;
            for (int j = 0; j < mas1.length; j++) {
                if (mas[i] != mas1[j]) {
                    count++;
                }
            }
            if (count == mas1.length) {
                mas2[k] = mas[i];
                k++;
            }
        }
        Kon(mas2, k);
    }
    static void Kon(int[] mas, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
