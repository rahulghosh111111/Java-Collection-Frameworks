import java.util.ArrayDeque;
public class LearnArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(11);
        adq.offerFirst(29);      // add an element to the queue in first position
        adq.offerLast(32);       // add an element to the queue in last position
        adq.offer(76);
        System.out.println(adq);    //output [29, 11, 32, 76]
    
        System.out.println(adq.peek());          //output = 29
        System.out.println(adq.peekFirst());    //give the first element    output = 29
        System.out.println(adq.peekLast());     //give the last element     output = 76

        System.out.println(adq.poll());            //output = 29
        System.out.println("poll" + adq);         //output = pool() [11, 32, 76]

        System.out.println(adq.pollFirst());        //output = 11
        System.out.println("pollFirst()" + adq);     //output = pollFirst() [32, 76]   // remove an element from the queue in first position

        System.out.println(adq.pollLast());         //output = 76
        System.out.println("pollLast()" + adq);     //output = pollLast() [32]  // remove an element from the queue in last position
    }
}
