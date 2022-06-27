import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = x.nextInt();

        System.out.print("Введите цифру: ");
        int zorro = x.nextInt();
        int robin = Tests(num, zorro);

        System.out.println("Количество цифр " + zorro + " в числе " + num + " = " + robin);
    }
    public static int Tests(int num, int digit) {
        int i, c = 0;
        int length = String.valueOf(num).length();
        for (i = 0; i < length; i++) {
            if (num % 10 == digit) {
                c++;
            }
            num /= 10;
        }
        return c;
    }
}