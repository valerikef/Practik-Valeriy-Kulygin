import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Точка x: ");
        int x = in.nextInt();

        System.out.print("Точка y: ");
        int y = in.nextInt();

        int pudge = pudge(x, y);
        System.out.println("Координата (" + x + ", " + y + "), находится в " + pudge + " четверти");
    }

    public static int pudge(int x, int y)
    {
        if (x > 0 && y > 0)
            return 1;
        else if (x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else if (x > 0 && y < 0)
            return 4;
        else
            return -1;
    }
}