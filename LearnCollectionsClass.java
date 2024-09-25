import java.util.List;    // for list identifier
import java.util.Collections; // for collections
import java.util.Comparator;  // for comparator
import java.util.ArrayList;  // for array list

public class LearnCollectionsClass {

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(34);
        list.add(12); 
        list.add(9);
        list.add(92);
        list.add(76);
        list.add(29);
        list.add(75);
        // System.out.println("min element: "+Collections.min(list));   // min element
        // System.out.println("max element: "+Collections.max(list));   // max element
        // System.out.println(Collections.frequency(list,9));        // frequency of an element // how much time 9 is comed in the list
        // Collections.sort(list);                                   // sort the list
        // System.out.println(list);
        
        Collections.sort(list, Collections.reverseOrder());       // sort the list in reverse order



        System.out.println(list);
    }
}