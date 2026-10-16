import java.util.Random;

public class Main {

    static int findR(int[] a) {
        int r = -1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int p = a[i] * a[j];
                if (p % 21 == 0 && (r == -1 || p < r)) {
                    r = p;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10001);
        }

        int r = findR(a);
        if (r == -1) {
            System.out.println("Число R не найдено, ответ: -1");
        } else {
            System.out.println("Минимальное число R = " + r);
        }
    }
}
