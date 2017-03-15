
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phonelist = new HashMap<String, Integer>();
        //store input
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonelist.put(name, phone);
        }
        
        //search with feedback
        while(in.hasNext()){
            String s = in.next();
            if(true){
                if(phonelist.get(s) == null){
                    System.out.println("Not found");
                } else{
                      System.out.println(s+"="+phonelist.get(s));  
                    }
                
            }
            
        }
        in.close();
    }
}
