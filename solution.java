
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class solution{
    public static void main(String[] args) {
        System.out.println(new solution().generate(5));
    }
public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();

    for (int row = 0; row < numRows; row++) {
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1); // First element is always 1

        for (int j = 1; j < row; j++) {
            int value = triangle.get(row - 1).get(j) + triangle.get(row - 1).get(j - 1);
            currentRow.add(value);
        }
          
        if (row > 0) {
            currentRow.add(1); // Last element is always 1
        }

        triangle.add(currentRow);
        
    }

    return triangle;
}
}