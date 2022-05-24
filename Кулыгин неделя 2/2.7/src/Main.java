import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner lefrut = new Scanner(System.in);
        Integer zefir, a, b, d;
        System.out.println("Введите 1 целое число: ");
        zefir = lefrut.nextInt();
        if (zefir < 1000 && zefir > 99)
        if (zefir > 500)
        {
            int temp;
            a = zefir/100;
            b = (zefir/10)%10;
            d = zefir%10;
            temp = d;
            d = a;
            a = temp;
            System.out.println(a + "" + b + "" + d);
        }
        else
        {
            int temp;
            a = zefir/100;
            b = (zefir/10)%10;
            d = zefir%10;
            temp = d;
            d = b;
            b = temp;
            System.out.println(a + "" + b + "" + d);
        }
    }
}