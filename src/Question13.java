public class Question13{
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;

        int index = -1; // assume not found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break; // mil gaya, aage dekhne ki zarurat nahi
            }
        }

        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
