import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner lefrut = new Scanner(System.in);
        double razor, Elder_Dragon;
        System.out.println("Введите 1 число: ");
        razor = lefrut.nextDouble();
        System.out.println("Введите 2 число: ");
        Elder_Dragon = lefrut.nextDouble();
        if (razor == Elder_Dragon)
        {
            System.out.println("Числа " + razor + " и " + Elder_Dragon + " равны!");
        }
        if (razor != Elder_Dragon)
        {
            System.out.println("Числа " + razor + " и " + Elder_Dragon + " не равны!");
        }
    }
}