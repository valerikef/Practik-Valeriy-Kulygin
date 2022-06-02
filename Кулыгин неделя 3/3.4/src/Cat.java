import java.util.Scanner;
public class Cat {
    public void Curse() {
        Scanner lefrut = new Scanner(System.in);
        int x, y, a = 0;
        System.out.println("Введите целое положительное число");
        y = lefrut.nextInt();
        for (x = 2; x <= y / 2; ++x)
        {
            if (y % x == 0){
                System.out.println(x + " ");
                a++;
            }
        }
        System.out.println("Всего делителей " + a);
    }
}
