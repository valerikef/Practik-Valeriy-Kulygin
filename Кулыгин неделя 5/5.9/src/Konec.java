public class Konec
{
    static void Vvod(int[] mas) {
        int znak = (int) (Math.random() * 2 + 1);
        if (znak == 1) {
            znak = -1;
        } else {
            znak = 1;
        }
        mas[0] = znak * (int) (Math.random() * 90) + 10;
        for (int i = 1; i < mas.length; i++) {
            boolean check = false;
            int count = 0;
            while (!check) {
                znak = (int) (Math.random() * 2 + 1);
                if (znak == 1) {
                    znak = -1;
                } else {
                    znak = 1;
                }
                mas[i] = znak * (int) (Math.random() * 90) + 10;
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
