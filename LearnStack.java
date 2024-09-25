import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Elephant");
        animals.push("Dog");
        System.out.println("Stack:" + animals);
        
        System.out.println("Peek:" + animals.peek());               // return the top element
         
        animals.pop();                                               // remove the top element
        System.out.println("Stack:" + animals);                      // remove the top element

        System.out.println("Peek:" + animals.peek());
    }
}
