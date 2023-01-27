public class Main {
    public static void main(String[] args) {
        gcd(10,20);
        System.out.println(isPrime());
    }



    public static int gcd(int a, int b) {  // a=7 b=21 =>
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
            System.out.println("temp = " + temp);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        return Math.abs(a);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}