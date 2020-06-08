package m5.s08;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class AsSortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = aSortedSet();
        System.out.println(sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());
        System.out.println(sortedSet.subSet(sortedSet.first() + 1, sortedSet.last()));
    }

    private static SortedSet<Integer> aSortedSet() {
        return new TreeSet<Integer>(Arrays.asList(12, 18, -5, -2233));
    }

}
/* [3 45 11] -> [3 11 45] 
   *  3        struttura ad albero a tre livelli..non li voglio troppi
   *    45
   *  18 
   * allora e ruoto faccio due livelli
   *     18
   *   3   45
   *   1
*/