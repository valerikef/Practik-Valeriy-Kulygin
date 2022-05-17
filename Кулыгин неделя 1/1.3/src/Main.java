import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner pudge = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        double sf1 = pudge.nextInt();

        System.out.println("Введите значение b: ");
        double sf2 = pudge.nextInt();

        double ARC = (sf1 + sf2) * 2;

        double Magnus = Math.sqrt(sf1 * sf1 + sf2 * sf2);

        System.out.println("Периметр прямоугольника равен:" + " " + ARC + " см");
        System.out.println("Длина диагонали равна:" + " " + Magnus + " см");
    }
}