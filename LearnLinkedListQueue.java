import java.util.LinkedList;
import java.util.Queue;
public class LearnLinkedListQueue {
    public static void main(String[] args) {
       
        Queue<Integer> queue = new LinkedList<>();                     // Queue of integers
        
        queue.offer(10);                                               // add an element to the queue      also can use add();
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);

        System.out.println(queue.poll());        // remove an element from the queue     also can use remove();
        System.out.println(queue);

        System.out.println(queue.peek());        // return the top element               also can use element();
        
    
    
     
    }
}
