import java.util.Scanner;
public class Cat {
    public void Curse() {
        int[] mas = new int[25];
        int[] mas1 = new int[25];
        int a = 0, b = 0;

        for (int x = 0; x < 25; ++x) {
            mas[x] = (int) Math.round(Math.random() * 899) + 100;
        }
        for (int x = 0; x < 25; ++x) {
            mas1[x] = mas[x] % 10 + (mas[x] / 10) % 10 + (mas[x] / 100) % 10;
            if (a < mas1[x])
            {
                a = mas1[x];
                b = x;
            }
        }
        System.out.println("Число под порядковым номером: " + (b + 1) + " Само число " + mas[b] + " Сумма цифр " + a);
    }
}
