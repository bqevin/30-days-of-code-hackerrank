import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader = new Scanner(System.in);
        List<Integer> n = new ArrayList<>();
        reader.nextInt();
        while(reader.hasNextInt()){
            n.add(reader.nextInt());
        }
        //Find mean
        int total = 0, fTotal = 0; 
        double mean = 0.0, cWeight = 0.0, weight = 0.0, wTotal = 0.0; 
        
        for(int i = 0; i < n.size(); i++){
            total += n.get(i);
           if(i == ((n.size())-1)){
               fTotal = total;
               mean = fTotal/n.size();
           }
           
        }
         for(int j = 0; j < n.size(); j++){
             
                weight = ((double)(n.get(j)) - mean);
                cWeight = weight*weight;
                wTotal += cWeight;
                
            }
        double ans  =  Math.sqrt(wTotal/n.size());
         System.out.println(Math.round(ans*10)/10.0);
        
        //System.out.println(mean);
    }
}