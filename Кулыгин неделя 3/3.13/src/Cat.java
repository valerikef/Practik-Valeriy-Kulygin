import java.util.Scanner;

public class Cat {
    public void Curse() {
        Scanner asd = new Scanner(System.in);
        double islo = 0;

        do {
            System.out.print("Введите целое, положительное число: ");
            islo = asd.nextDouble();
        } while (islo <= 0 || islo % 1 != 0);

        int count = 0;

        for (int i = 1; i < islo / 2 + 1; i++) {
            if (islo % i == 0) {
                count = 0;
                for (int j = 1; j < i / 2 + 1; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
