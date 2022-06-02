public class Cat {
    public void Curse() {
        int a = 0, x;
        for (x = 10; x < 100; x++) {
            if (x % 10 != 0) {
                if (x % ((x % 10) * (x / 10)) == 0) {
                    a = x;
                }
            }
        }
        System.out.println("Достигло 5 нечётных чисел на чётных местах");
    }
}
