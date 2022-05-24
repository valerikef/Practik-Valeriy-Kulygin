import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner lefrut = new Scanner(System.in);
        int Blinding_Lights;
        System.out.println("Введите 1 число: ");
        Blinding_Lights = lefrut.nextInt();
       if (Blinding_Lights < 0)
       {
           Blinding_Lights = Blinding_Lights * Blinding_Lights;
           System.out.println(Blinding_Lights);
       }
        if (Blinding_Lights >= 0)
        {
            System.out.println("Ошибка");
        }
    }
}