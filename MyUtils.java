import java.util.Set;

class MyUtils {
    public static <T> void printSet(Set<T> set) {
        for (T element : set) {
            System.out.println(element);
        }
    }
}