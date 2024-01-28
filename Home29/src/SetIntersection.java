import java.util.HashSet;
import java.util.Set;

public class SetIntersection {
    public static Set<String> getIntersection(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
