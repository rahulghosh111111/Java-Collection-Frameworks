import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t> 0) {
            int a1 = scanner.nextInt(); 
            int a2 = scanner.nextInt(); 
            int b1 = scanner.nextInt(); 
            int b2 = scanner.nextInt(); 

            int ways = countWays(a1, a2, b1, b2);
            System.out.println(ways);
        }
    }

    public static int countWays(int a1, int a2, int b1, int b2) {
        int ways = 0;

        if (a1 > b1 && a2 > b2) ways++;
        if (a1 > b2 && a2 > b1) ways++;
 
        
        if (a1 > b1 && a2 < b2) ways++;
        if (a1 > b2 && a2 < b1) ways++;
        if (a1 < b1 && a2 > b2) ways++;
        if (a1 < b2 && a2 > b1) ways++;

        return ways;
    }
}