import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> arr = new ArrayList<Integer>();
        Scanner reader =  new Scanner(System.in);
        int top = 0, bottom= 0;
        reader.nextInt();
        while (reader.hasNextInt())
        {
            int current = reader.nextInt();
            arr.add(current);
        }
        
        for(int i=0; i < arr.size()/2; i++){
            for(int j = (arr.size()/2); j < arr.size(); j++){

                if(j > i && (arr.get(i) == arr.get(j))){break;}
                top += (arr.get(i) * arr.get(j));
                bottom += arr.get(j);
                 System.out.println(top);
                 System.out.println(bottom);
                 System.out.println((double)(top/bottom));
               // if(j < i && (arr.get(i) == arr.get(j))){break;}

                if(j== ((arr.size())-1)){
                  System.out.println((double)(top/bottom));
                }

                
            }
        }
       
       
        
       
        
    }
    
}