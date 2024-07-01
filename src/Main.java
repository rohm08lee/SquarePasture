import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("square.in"));
        PrintWriter pw = new PrintWriter("square.out");

        int xMin = Integer.MAX_VALUE, xMax = Integer.MIN_VALUE, yMin = Integer.MAX_VALUE, yMax = Integer.MIN_VALUE;
        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            xMin = Math.min(x1, xMin);
            xMax = Math.max(x2, xMax);
            yMin = Math.min(y1, yMin);
            yMax = Math.max(y2, yMax);
        }

        int diff = Math.max(xMax-xMin, yMax-yMin);
        pw.println(diff * diff);
        pw.close();
    }
}