import java.util.Scanner;

public class Cat {
    public void Curse() {
        Scanner asd = new Scanner(System.in);
        int ludi = 0;
        double wes = 0, w = 0;
        do {
            System.out.println("Введите вес человека который вошел в лифт : ");
            w = asd.nextDouble();
            wes += w;
            ++ludi;
        } while (ludi < 6 && wes < 450);

        if (wes <= 450 && ludi == 6) {
            System.out.println("Человек вошло: " + ludi);
            System.out.println("Вес вошедших людей: " + wes + "кг");
            System.out.println("Вход прекращён, так как достигнут максимум вместимости человек");
        }
        else if (wes == 450) {
            System.out.println("Всего человек вошло: " + ludi);
            System.out.println("Общий вес вошедших людей: " + wes + "кг");
            System.out.println("Вход прекращён, так как достигнут максимум веса вошедших людей");
        }
        else {
            System.out.println("Всего человек вошло: " + (ludi - 1));
            System.out.println("Общий вес вошедших людей: " + (wes - w) + "кг");
            System.out.println("Вход прекращён, так как общий вес вошедших превысил 450кг и следовательно последний человек не учитывается");
        }
    }
}
