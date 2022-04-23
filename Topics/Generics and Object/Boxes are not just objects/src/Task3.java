public class Task3 {
    public static void main(String[] args) {

        int[] a = {9, 8, 3, 1, 5, 4};

        for (int i = 0; i < a.length; i = i + 1){
            if (a[i] % 2 == 0) {
                a[i] += 1;
            } else {
                a[i] -= 1;
            }
        }

        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}