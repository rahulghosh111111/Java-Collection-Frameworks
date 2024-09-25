//import java.util.HashSet;
import java.util.Set; 
//import java.util.LinkedHashSet; 
import java.util.TreeSet; 
public class LearnSet {
    public static void main(String[] args) {
        //Set<Integer> set = new HashSet<>();  // Set of integers 
        //Set<Integer> set = new LinkedHashSet<>();  // Set of integers of  LinkedHashSet     // hashset and linked hashed both are same  


        Set<Integer> set = new TreeSet<>();   // Set of integers of  TreeSet      // TreeSet is a sorted set of integers (all elements are sorted)
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);
        set.remove(21);

        System.out.println(set);

        System.out.println(set.contains(37));     // check if the element is present in the set or not

        System.out.println(set.size());           // size of the set

        System.out.println(set.isEmpty());        // check if the set is empty or not

        set.clear();                               // clear the set
         System.out.println(set);








    }
}
