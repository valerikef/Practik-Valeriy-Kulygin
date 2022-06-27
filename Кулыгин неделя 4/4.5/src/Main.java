import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner vanilka = new Scanner(System.in);

    int x1 = vanilka.nextInt(),
    y1 = vanilka.nextInt(),
    x2 = vanilka.nextInt(),
    y2 = vanilka.nextInt();

    System.out.printf("%.2f", (len(x1,y1,x2,y2)));
    }
    public static double len(int x, int y, int xk, int yk)
    {
        return(Math.sqrt((x-xk)*(x-xk)+(y-yk)*(y-yk)));
    }
}
