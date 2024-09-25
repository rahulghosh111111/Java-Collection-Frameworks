import java.util.ArrayList;
public class learnArrayList{
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>();   // Empty arraylist of strings 
        // list.add("Hello");                                // add an element to the list
        // list.add("World");
        // System.out.println(list);

        // list.remove(0);                                    // remove an element from the list at a particular index
        // System.out.println(list);

        // list.remove("Hello");                              // remove an element from the list
        // System.out.println(list);

        // list.add(0, "Rahul");                // add an element at a particular index
        // System.out.println(list);

        // System.out.println(list.get(1));              // get an element at a particular index
        

        // ArrayList<String> list2 = new ArrayList<String>();   // Empty arraylist of strings
        // list2.add("Hello Rahul");
        // list2.add("Hello Raj");
        // list.addAll(list2);                                  // add all elements of list2 to list
        // System.out.println(list);

        // list.clear();                                     // clear the list
        // System.out.println(list);
        ArrayList<Integer> list = new ArrayList<Integer>();    // Empty arraylist of integers>
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);
        list.set(2, 1000);                         // set an element at a particular index
        System.out.println(list);

        System.out.println(list.contains(40));                   // check if an element is present in the list
        
        for(int i=0; i<list.size(); i++){                        // print all elements of the list
            System.out.println(list.get(i));
        }
  

        for(int i: list){                                        // print all elements of the list  using "foreach" loop  
            System.out.println("For Each Element is :"+i);
        }

        java.util.Iterator<Integer> it=list.iterator();            
        while(it.hasNext()){                                         // print all elements of the list using iterator
            System.out.println("iterator element is :"+it.next());
        }


    }
}