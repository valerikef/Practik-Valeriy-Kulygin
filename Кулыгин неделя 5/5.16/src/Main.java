import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] mas = new int[n];
        System.out.print("Введите радиус окружности: ");
        int r = in.nextInt();
        Konec.Vvod(mas, r);
    }
}