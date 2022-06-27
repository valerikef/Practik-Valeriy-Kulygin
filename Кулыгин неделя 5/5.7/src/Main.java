import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива (на 1 больше от желаемого): ");
        int n = in.nextInt();
        int[] mas = new int[n];
        Konec.Vvod(mas);
    }
}