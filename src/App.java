public class App {
    public static void main(String[] args) throws Exception {
        //runFibonaci();
        //runFibonaciRecPD();
        runFibonaciIterativo();
        runFibonaciIterativo2();

    }

    private static void runFibonaciIterativo2() {
        long startTime = System.nanoTime();
        int num = 48;
        long i = getFibonacciIter2(num);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        double milliseconds = (executionTime / 1_000_000.0);

        System.out.println("Finbonaci de " + num + " es " + i + "  en: " + milliseconds + " milliseconds");

    }

    private static void runFibonaciIterativo() {
        long startTime = System.nanoTime();
        int num = 48;
        long i = getFibonacciIter(num);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        double milliseconds = (executionTime / 1_000_000.0);

        System.out.println("Finbonaci de " + num + " es " + i + "  en: " + milliseconds + " milliseconds");

    }
        

    private static long getFibonacciIter(int num) {
        if (num <= 1)
            return num;
        long [] cache = new long[num + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i <= num; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];


        }
        return cache[num];
    }
    private static long getFibonacciIter2(int num) {
        if (num <= 1)
            return num;
        long  n1 = num-2;
        long n2 = num -1;
        long n3 = 0;
        for (int i = 2; i <= num; i++) {
            n3 = (n1) + (n2);
            n3 = n2;
            n2= n3;
        }
        return n3;
    }


    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long[] dp= new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    private static void runFibonaciRecPD() {
        long startTime = System.nanoTime();
        int num = 48;
        long[] cache = new long[num +1];
        long i = getFibonacciRecPD(num, cache );
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        double milliseconds = (executionTime / 1_000_000.0);

        System.out.println("Finbonaci de " + num + " es " + i + "  en: " + milliseconds + " milliseconds");

    }

    private static long getFibonacciRecPD(int num, long[] cache) {
        if(num <= 1) {
            return num;
        }
        if(cache[num] != 0) {
            return cache[num];
        }
        cache[num] = getFibonacciRecPD(num - 1, cache) + getFibonacciRecPD(num - 2, cache);
        return cache[num];
    }

    private static void runFibonaci() {
        long startTime = System.nanoTime();
        int num = 48;
        long i = getFibonacci(num);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        double milliseconds = (executionTime / 1_000_000.0);

        System.out.println("Finbonaci de " + num + " es " + i + "  en: " + milliseconds + " milliseconds");

    }

    private static long getFibonacci(int i) {
        if (i <= 1) {
            return i;
        }
        return getFibonacci(i - 1) + getFibonacci(i - 2);
    }



}