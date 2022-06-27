import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        int d;
        double num;

        System.out.print("Введите целое положительное число: ");
        num = x.nextDouble();
        if (num < 0 || num % 1 != 0) {
            System.out.println("Вы ввели неверное число!");
        }
        System.out.println("Общее кол-во делителей: " + zefir(num));
    }
    static int zefir(double num){
        int count = 0;
        for (double i = num; i <= num * 2; i++) {
            for (double j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}