public class Konec
{
    static void Vvod(int[] mas, int[] mas1) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
            mas1[i] = (int) (Math.random() * 21) - 10;
        }
        boolean check = true;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != mas1[i]) {
                check = false;
                break;
            }
        }
        Kon(check);
    }
    static void Kon(boolean check) {
        if (check) {
            System.out.println("Массивы идентичные");
        } else {
            System.out.println("Массивы разные");
        }
    }
}
