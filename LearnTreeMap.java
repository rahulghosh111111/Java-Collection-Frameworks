import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {

        TreeMap<String , Integer> numbers = new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);
        System.out.println(numbers);  // output : {Five=5, Four=4, One=1, Three=3, Two=2} for alphhabetical order

        numbers.remove("Three");
        System.out.println(numbers);


    }
}
