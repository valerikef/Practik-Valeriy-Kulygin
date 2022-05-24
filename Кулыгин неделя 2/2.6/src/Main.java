import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner lefrut = new Scanner(System.in);
        int zefir, a, b;
        System.out.println("Введите 1 целое число: ");
        zefir = lefrut.nextInt();
        if (zefir > 9 && zefir < 100)
        {
            a = zefir/10;
            b = zefir%10;
            if (a > b)
            {
                System.out.println("Первое число больше");
            }
            if (a < b)
            {
                System.out.println("Второе число больше");
            }
        }
        else
        {
            System.out.println("Ошибка");
        }
    }
}