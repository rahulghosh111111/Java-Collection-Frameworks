import java.util.Arrays;
public class LearnArraysClass {
    public static void main(String[] args) {
        // int []numbers = {1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(numbers, 5);
        // System.out.println(index);
    
        Integer []numbers = {10,43,98,33,12,93,87,42,9,1,3,55,23,32};
        Arrays.sort(numbers);

       // Arrays.fill(numbers, 0);      //fill the array with 0  // all the value will be 0

        for(int i : numbers){
            System.out.print(i+" ");     //sort the array
        }

    
    }
}
