public class check1 {

    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            Math.random();
        }
        System.out.println("Math.random() Time: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (long i = 0; i < 8000000000L; i++) {
            // perform random math functions to use CPU
            int v = 4 * 67 + 87 / 45 * 2345;
        }
        System.out.println("Simple Math Time: " + (System.currentTimeMillis() - start) + "ms");
    }
}