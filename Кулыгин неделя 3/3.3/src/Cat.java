import java.util.Scanner;
public class Cat {
    public void Curse(){
        int x;
        for (x = 99; x > 9; x--) {
            if (9 < ((x % 10) * (x / 10)) && ((x % 10) * (x / 10)) < 100)
                System.out.print(x + " ");
    }
}
}
