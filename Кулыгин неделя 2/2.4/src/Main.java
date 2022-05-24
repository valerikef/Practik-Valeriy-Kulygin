import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner lefrut = new Scanner(System.in);
        int Blinding_Lights, Uragirimono_no_requiem;
        System.out.println("Введите 1 число: ");
        Blinding_Lights = lefrut.nextInt();
        System.out.println("Введите 2 число: ");
        Uragirimono_no_requiem = lefrut.nextInt();
       if (Uragirimono_no_requiem > Blinding_Lights)
       {
           System.out.println(Blinding_Lights + " " + Uragirimono_no_requiem);
           System.out.print(Uragirimono_no_requiem + " " + Blinding_Lights);
       }
       if (Uragirimono_no_requiem < Blinding_Lights)
       {
           System.out.println(Uragirimono_no_requiem + " " + Blinding_Lights);
           System.out.print(Blinding_Lights + " " + Uragirimono_no_requiem);
       }
    }
}