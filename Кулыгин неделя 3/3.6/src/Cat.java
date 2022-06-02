import java.util.Scanner;

public class Cat {
    public void Curse() {
        int[][] mas = new int[120][2];
        int a;
        for (int i = 0; i < 120; i++) {
            mas[i][0] = (int) Math.round(Math.random() * 10) + 19;
            mas[i][1] = (int) Math.round(Math.random() * 20) + 64;
        }

        for (a = 0; a < 120; a++) {
            if (22 <= mas[a][0] && mas[a][0] <= 26) {
                if (71 <= mas[a][1] && mas[a][1] <= 77) {
                    System.out.println("Шарик " + (a+1) + " Диаметр шарика: " + mas[a][0] + " Вес шарика: " + mas[a][1] + " Шарик соответствует стандартам");
                } else {
                    System.out.println("Шарик " + (a+1) + " Диаметр шарика: " + mas[a][0] + " Вес шарика: " + mas[a][1] + " Шарик не соответствует стандартам, отклонение по весу");
                }
            } else {
                if (71 <= mas[a][1] && mas[a][1] <= 77) {
                    System.out.println("Шарик " + (a+1) + " Диаметр шарика: " + mas[a][0] + " Вес шарика: " + mas[a][1] + " Шарик не соответствует стандартам, отклонение по диаметру");
                } else {
                    System.out.println("Шарик " + (a+1) + " Диаметр шарика: " + mas[a][0] + " Вес шарика: " + mas[a][1] + " Шарик не соответствует стандартам, отклонение по диаметру и весу");
                }
            }
        }
    }
}
