import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(0, 1, 2));

        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        System.out.println(findSymmetric(set, set2));
    }

    public static Set<Integer> findSymmetric(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : set1) {
            if (!set2.contains(i)) {
                result.add(i);
            }
        }
        for (Integer i : set2) {
            if (!set1.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}