import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner lefrut = new Scanner(System.in);
        int Astel_naturalborn_of_the_void, Elden_Beast;
        System.out.println("Введите число: ");
        Astel_naturalborn_of_the_void = lefrut.nextInt();
        if (Astel_naturalborn_of_the_void < 0)
        {
            Elden_Beast = Astel_naturalborn_of_the_void * -1;
            System.out.println(Elden_Beast);
        }
        if (Astel_naturalborn_of_the_void >= 0)
        {
            System.out.println("0");
        }
    }
}