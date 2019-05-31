public class Cycle {
    public static void main(String[] args) {
        System.out.println("------------------");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("------------------");
        int i = 6;
        while (i > -6) {
            i -= 2;
            System.out.println(i);
        }
        System.out.println("------------------");
        int t = 10;
        do {
            t ++;
            if (t % 2 != 0) {
                System.out.println(t);
            }
        } while ( t < 20);
        System.out.println("------------------");
    }
}
