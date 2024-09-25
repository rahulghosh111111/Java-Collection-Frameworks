import java.util.HashMap;
import java .util.Map;

public class LearnMap {

    public static void main(String[] args) {
        // HashMap
        // LinkedHashMap
        // TreeMap
        Map<String , Integer> numbers = new HashMap<>();
        numbers.put("one" , 1);
        numbers.put("two" , 2);
        numbers.put("three" , 3);
        numbers.put("four" , 4);
        numbers.put("five" , 5);

        System.out.println(numbers);

        
        // if(!numbers.containsKey("two")) {     // if the key "two" is not present in the map then add it 
        //     numbers.put("two" , 83);
        // }

          System.out.println(numbers.isEmpty());           // check if the map is empty or not
        //System.out.println(numbers.containsKey("two"));     //check if the key(String) is present in the map or not
        //System.out.println(numbers.containsValue(4));      //check if the value is present in the map or not



       // numbers.putIfAbsent("two",23);   //the upper if part and this ifAbsent part both are same
        //System.out.println(numbers);

        // for(Map.Entry<String , Integer> e : numbers.entrySet()) { // for each loop to iterate through the map ,each entry print individually
        //         System.out.println(e);
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }


        //     for(String key : numbers.keySet()){      //return the keys of the map Strings
        //         System.out.println(key);    
        //     }
        //     for(Integer value : numbers.values()){    //return the values of the map integers
        //         System.out.println(value);    
        //     }
    
    
    
    
    
    
    
    }
}
