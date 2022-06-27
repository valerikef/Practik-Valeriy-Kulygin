import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner l = new Scanner(System.in);
        System.out.print("Введите координату X центра окружности: ");
        int x = l.nextInt();

        System.out.print("Введите координату Y центра окружности: ");
        int y = l.nextInt();

        System.out.print("Введите радиус круга: ");
        int c = l.nextInt();

        System.out.print("Введите координату X точки А: ");
        int a = l.nextInt();

        System.out.print("Введите координату Y точки А: ");
        int b = l.nextInt();

        Circle(x, y, c, a, b);
    }
    public static void Circle(int x, int y, int c, int a, int b)
    {
        double zz = Math.pow(x - a, 2);
        double xx = Math.pow(y - b, 2);

        if (zz + xx <= Math.pow(c,2))
        {
            System.out.println("Точка А лежит в окружности или на окружности");
        }
        else System.out.println("Точка А вне окружности");
    }
}