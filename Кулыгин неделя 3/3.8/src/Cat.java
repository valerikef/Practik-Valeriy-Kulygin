import java.util.Scanner;
public class Cat {
    public void Curse() {
        int[] mas = new int[24];
        int a = 0, b = 0;

        for (int x = 0; x < 24; ++x) {
            mas[x] = (int) Math.round(Math.random() * 899) + 100;
        }
        for (int x = 0; x < 24; ++x) {
            if (a < mas[x])
            {
                a = mas[x];
                b = x;
            }
        }
        System.out.println("Число под порядковым номером: " + (b + 1) + " Самое большое число: " + mas[b]);
    }
}
