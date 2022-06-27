import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int z = a.nextInt();
        if (z < 0){
            System.out.println("-1");
        }
        if (z == 0){
            System.out.println("0");
        }
        if (z > 0){
            System.out.println("1");
        }
    }
}