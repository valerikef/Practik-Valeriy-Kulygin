import java.util.Scanner;

public class Cat {
    public void Curse() {
        Scanner lefrut = new Scanner(System.in);
        double x;

        do {
            System.out.print("Введите целое положительное число по выбору: ");
            x = lefrut.nextDouble();

            if (x % 1 != 0 || x < 0)
                System.out.println("Вы ввели неверное число");
        } while (x % 1 != 0 || x < 0);

        for (int i = 0; i < 17; i++) {
            if (i == 0) {
                System.out.printf("%.0f ", x + 1);
                x++;
            } else  {
                System.out.printf("%.0f ", x + 3);
                x += 3;
            }
        }
        System.out.println("по вашему выбору");
    }
}
