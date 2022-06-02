import java.util.Scanner;
public class Cat {
    public void Curse() {
        Scanner wild = new Scanner(System.in);
        int a = 0, b = 1;
        for (;a < 5;) {
            System.out.print("Введите целое число: ");
            int z = wild.nextInt();
            if (b % 2 == 1 && z % 2 == 0) {
                a++;
            }
            b++;
        }
        System.out.println("Достигло 5 нечётных чисел на чётных местах");
    }
}
