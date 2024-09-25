import java.util.PriorityQueue;
import java.util.Comparator;    
import java.util.Queue;
public class LearnPriorityQueue {
    public static void main(String[] args) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());            //before- Queue of integers........then after adding "Comparator.reverseOrder();" then it will return the largest element first    
    
        pq.offer(10);                                               // add an element to the queue      also can use add();
        pq.offer(8);
        pq.offer(3);
        pq.offer(40);
       
        System.out.println(pq);                                        // print the queue in ascending order, first is the smallest element

        pq.poll();        // remove an element from the queue     also can use remove();
        System.out.println(pq);

                
        System.out.println(pq.peek());        // return the top element               also can use element();


    }

}
