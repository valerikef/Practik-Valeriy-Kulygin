public class Konec
{
    static void Vvod(int n) {
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 900) + 100;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        Kon(mas);
    }
    static void Kon(int[] mas) {
        if (mas.length % 2 == 0) {
            for (int i = 0; i < mas.length / 2; i++) {
                System.out.print(mas[i] + " ");}
            System.out.println();
            for (int i = mas.length - 1; i > mas.length / 2 - 1; i--) {
                System.out.print(mas[i] + " ");}
        } else if (mas.length % 2 == 1) {
            for (int i = 0; i < mas.length / 2 + 1; i++) {
                System.out.print(mas[i] + " ");}
            System.out.println();
            for (int i = mas.length - 1; i > mas.length / 2; i--) {
                System.out.print(mas[i] + " ");}
        }
    }
}
