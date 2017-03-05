import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         List<Integer> n = new ArrayList<Integer>();
        int i, right, left, times, mode = 0; double middle, mid, total = 0;
        
        reader.nextInt(); //Skips first line as usual

        //Add rest items into list array
        while(reader.hasNextInt()){
            n.add(reader.nextInt());
        }        

        //Sum and compare number of occurence of items in the list values
        for(i=0; i < n.size(); i++ ){
            times = 0; int max = 1 ;

            //Comparison happens here 
            for(int j=0; j < n.size(); j++){

                //Stop printing already printed item
                if(j < i && (n.get(i) == n.get(j))){break;}

                //Checks if found then adds counter
                if((n.get(i)).equals(n.get(j))){
                    times += 1;

                     //Set mode to true value 
                    //TODO: Not sure if will work :)
                     if( ((n.get(i)).equals(n.get(j))) && (times > max) ){
                        max = times;
                        mode = mode = n.get(i);
                    } else {
                         max = 1;
                         //Get item with smallest value
                        Collections.sort(n);  
                         mode = n.get(0);
                        
                     }
                    
                }   
                //Ensures print comes after every element complete search cycle
                if(j == ((n.size())-1)){
                }
            }
            //Add up all the items
            total = total + n.get(i);
        }
        
        //Calculate the mean
        double mean = (total/n.size());
        System.out.println(mean);
        
        //Sort numbers array 
        Collections.sort(n);   
        
        //Calculate the Median
        if(n.size() % 2 == 0){
            right = n.size()/2;
            left = right - 1;
            middle = n.get(left) + n.get(right);
            mid = middle/2;
            System.out.println(mid);
        } else {
            middle = n.get(n.size()/2);
            System.out.println(middle);
        }

        //Calculate Mode
        
        System.out.println(mode);
        
}
        
    
}