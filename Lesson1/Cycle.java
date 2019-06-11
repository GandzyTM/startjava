public class Cycle {
    public static void main(String[] args) {
        System.out.println("------- All nums wtih FOR [0,20] -----------");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("------------------");

        System.out.println("------- All nums wtih WHILE [6,-6] iter 2 -----------");
        int i = 6;
        while (i > -6) {
            i -= 2;
            System.out.println(i);
        }
        System.out.println("------------------");

        System.out.println("------- All nums sum with DO WHILE [10,20] -----------");
        int min = 10;
        int max = 20;
        int n = (max - min)/2;
        System.out.println((min + max)/2 * n);
        System.out.println("------------------");
    }
}
