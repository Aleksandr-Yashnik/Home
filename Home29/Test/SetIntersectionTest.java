import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetIntersectionTest {
    @Test
    public void testGetIntersection() {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("grape");
        set2.add("pineapple");

        Set<String> expectedIntersection = new HashSet<>();
        expectedIntersection.add("banana");

        Set<String> actualIntersection = SetIntersection.getIntersection(set1, set2);

        Assertions.assertEquals(expectedIntersection, actualIntersection);
    }
}