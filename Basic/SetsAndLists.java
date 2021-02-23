package Basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetsAndLists {
    public static void main(String[] args) {
        // not consider order: HashSet
        // consider order: TreeSet
        // faster on certain operation: LinkedHashSet
        Set<Integer> t = new HashSet<Integer>();
        t.add(1);
        t.add(7);
        t.add(6);
        t.remove(7);

        System.out.println(t);
        System.out.println(t.contains(5));
        System.out.println(t.size());

        // ArrayList: When we don't convince number of elements
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(7);
        arr.add(9);
        System.out.println(arr.get(0));
        arr.set(1, 5);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.subList(2, 4));
    }
}