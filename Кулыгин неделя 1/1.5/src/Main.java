import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double enigma;
        Scanner pudge = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        double sf1 = pudge.nextDouble();

        System.out.println("Введите второе значение: ");
        double sf2 = pudge.nextDouble();

        System.out.println("Введите действие (+, -, *, /):");
        String sf3 = pudge.next();

        if (sf3.equals("/") && sf2 == 0) {
            System.out.println("Ошибка, делить на 0 нельзя");
        }
        else if (sf3.equals("+")) {
            enigma = sf1 + sf2;
            System.out.println(enigma);
        }
        else if (sf3.equals("-")) {
            enigma = sf1 - sf2;
            System.out.println(enigma);
        }
        else if (sf3.equals("*")) {
            enigma = sf1 * sf2;
            System.out.println(enigma);
        }
        else if (sf3.equals("/")) {
            enigma = sf1 / sf2;
            System.out.println(enigma);
        }
    }
}