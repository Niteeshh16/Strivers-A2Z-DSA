package basicRecursion;

public class PrintNTimes {
    static void recr(String name, int count) {

        if (count > 5) return;   // base condition

        System.out.println(name);

        // recursive call with incremented count
        recr(name, count + 1);
    }

    public static void main(String[] args) {
        recr("Niteesh", 1); // start count at 1
    }
}
