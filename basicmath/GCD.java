package basicmath;

public class GCD {
    static int findGcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
    }

    static int findlcm(int a, int b){
        return (a*b)/findGcd(a,b);
    }
    public static void main(String[] args) {
        System.out.println("gcd is :"+findGcd(45,50));
        System.out.println("lcm is :"+findlcm(45,50));

    }
}
