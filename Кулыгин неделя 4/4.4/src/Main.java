import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        System.out.print("Введите число: ");
        int
                num = x.nextInt(),
                res = evenOrOdd(num);
        System.out.println("Число " + num);
        System.out.println("Результат: " + res);
    }

    public static int evenOrOdd (int num)
    {
        int
                a = 0,
                b = 0,
                length = String.valueOf(num).length();
        for (int i = 0; i < length; i++)
        {
            int x = num % 10;
            if (x % 2 == 0)
                a++;
            else
                b++;
            num /= 10;
        }
        if (a > b)
            return 1;
        else if (a < b)
            return -1;
        else
            return 0;
    }
}