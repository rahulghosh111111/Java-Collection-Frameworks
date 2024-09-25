import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); 
        int s = scanner.nextInt(); 
        int n = scanner.nextInt(); 

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = scanner.nextInt();
            end[i] = scanner.nextInt();
        }

        boolean canShower = canShower(m, s, start, end);

        if (canShower) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean canShower(int m, int s, int[] start, int[] end) {
        int currentTime = 0;

        for (int i = 0; i < start.length; i++) {
            if (currentTime < start[i]) {
                if (start[i] - currentTime >= s) {
                    return true;
                }
                currentTime = start[i];
            }
            currentTime = Math.max(currentTime, end[i]);
        }

        if (m - currentTime >= s) {
            return true; 
        }

        return false;   
    }
}