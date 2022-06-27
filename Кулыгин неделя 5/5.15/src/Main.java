import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер первого массива: ");
        int n = in.nextInt();
        int[] mas = new int[n];
        System.out.print("Введите размер второго массива: ");
        n = in.nextInt();
        int[] mas1 = new int[n];
        Konec.Vvod(mas, mas1);
    }
}