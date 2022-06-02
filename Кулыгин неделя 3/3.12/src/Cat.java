import java.util.Scanner;

public class Cat {
    public void Curse() {
        Scanner asd = new Scanner(System.in);
        int a = 0, all = 0;
        for (a = 100; a < 1000; a++) {
        if (a % 10 == 0) {
            all = 0;
              for (int j = 1; j < a; j++) {
                  if (a % j == 0 && j % 2 == 1) {
                      all += j;
                  }
              }
              if (all % 10 == 0) {
                  System.out.print(a + " ");
              }
            }
        }
    }
}
