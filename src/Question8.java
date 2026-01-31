public class Question8 {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 900, 87, 65};
        int target = 90;

        boolean found = false;

        for (int i : arr) {
            if (i == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
    }
}
