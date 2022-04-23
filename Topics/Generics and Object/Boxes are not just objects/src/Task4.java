public class Task4 {
    public static void main(String[] args) {

        int[] a = {3, 5, 2, 1};

        int x = 10;
        a[0] -= x;
        a[1] += x;
        x -= a[2];
        a[2] = x;
        a[3] -= x;

        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}