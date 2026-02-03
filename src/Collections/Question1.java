import java.util.HashMap;
import java.util.Map;

class Question1{

    public static void frequencyCount(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // testing
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        frequencyCount(arr);
    }
}