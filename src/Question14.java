public class Question14 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }

        // print
        for (int x : rev) {
            System.out.print(x + " ");
        }
    }
}
