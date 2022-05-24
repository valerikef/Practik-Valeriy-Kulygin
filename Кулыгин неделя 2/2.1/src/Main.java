import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double avg;
        Scanner lefrut = new Scanner(System.in);
        System.out.println("Введите avg ");
        avg = lefrut.nextDouble();
        if (avg == 100)
        {
            System.out.println("Молодец");
        }
        double mark, mark10;
        System.out.println("Введите mark ");
        mark = lefrut.nextDouble();
        if (mark < 60)
        {
            mark10 = mark * 0.1;
            mark = mark10 + mark;
            System.out.println("Увеличили значение на 10% и получилось: " + mark);
        }
        double one, two;
        System.out.println("Введите one ");
        one = lefrut.nextDouble();
        System.out.println("Введите two ");
        two = lefrut.nextDouble();
        if (one > two)
        {
            System.out.println(one);
        }
        if (one <= two)
        {
            System.out.println(two);
        }
        double num;
        System.out.println("Введите num ");
        num = lefrut.nextDouble();
        if (num > 0)
        {
            System.out.println("положительное");
        }
        if (num < 0)
        {
            System.out.println("Отрицательное");
        }
        if (num == 0)
        {
            System.out.println("Вы ввели неизвестное число, попробуйте снова.");
        }
        double ugol, ugol1, ugol2;
        System.out.println("Введите ugol ");
        ugol = lefrut.nextDouble();
        System.out.println("Введите ugol1 ");
        ugol1 = lefrut.nextDouble();
        System.out.println("Введите ugol2 ");
        ugol2 = lefrut.nextDouble();
        if (ugol + ugol1 + ugol2 == 180)
        {
            System.out.println("Это углы одного треугольника");
        }
        if (ugol + ugol1 + ugol2 != 180)
        {
            System.out.println("Это не углы одного треугольника");
        }
    }
}