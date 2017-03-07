import java.io.*;
import java.util.*;

public class Solution {    
    public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        String []arr=new String[T];

        for (int i=0; i<T; i++){
            arr[i]=in.next();
            char [] arrChar= new char[arr[i].length()];
            arrChar=arr[i].toCharArray();
            for (int j=0; j<arr[i].length();j++){
                if(j%2==0 || j==0)
                System.out.print(arrChar[j]);

            }
            System.out.print(" ");
            for (int j=0; j<arr[i].length();j++){
                if(j%2>0)
                System.out.print(arrChar[j]);

            }

             System.out.println();
        }
    }
}