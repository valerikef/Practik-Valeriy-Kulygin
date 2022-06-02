import java.util.Scanner;
public class Cat {
    public void Curse() {
        int a = 0, b = 1, c = 0, x;
        for (x = 1; x < 10; ++x) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
