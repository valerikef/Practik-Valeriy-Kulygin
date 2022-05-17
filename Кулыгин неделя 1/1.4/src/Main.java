import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner pudge = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        double sf1 = pudge.nextInt();

        System.out.println("Введите второе значение: ");
        double sf2 = pudge.nextInt();

        if (sf1 > sf2) {
            System.out.println("Первое число больше второго");
        }
        if (sf1 == sf2) {
            System.out.println("Числа равны");
        }
        if (sf1 < sf2) {
            System.out.println("Первое число меньше второго");
        }

    }
}