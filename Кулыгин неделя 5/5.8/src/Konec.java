public class Konec
{
    static void Vvod(int[] mas) {
        mas[0] = (int) (Math.random() * 90) + 10;
        for (int i = 1; i < mas.length; i++) {
            boolean check = false;
            int count = 0;
            while (!check) {
                mas[i] = (int) (Math.random() * 90) + 10;
                for (int j = 0; j < i; j++) {
                    if (mas[i] == mas[j]) {
                        count++;
                    }
                }
                if (count == 0) {
                    check = true;
                }
            }
        }
        Kon(mas);
    }
    static void Kon(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
