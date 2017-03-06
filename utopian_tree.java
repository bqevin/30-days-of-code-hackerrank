import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader = new Scanner(System.in);
        int items = reader.nextInt();
        
        for (int i = 0; i < items; i++) {
            int initialH = 1;
            int cycles = reader.nextInt();
            while (cycles > 0) {
                initialH *= 2;
                cycles--;
                if (cycles == 0) break;
                initialH += 1;
                cycles--;
            }
            System.out.println(initialH);
        }
        
    }
}