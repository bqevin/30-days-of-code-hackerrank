import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    //to Binary converter
    private static String printBinary(int n) {
        if (n == 0) {
           return "0";
       }
       String binary = "";
       while (n > 0) {
           int rem = n % 2;
           binary = rem + binary;
           n = n / 2;
       }
       return binary;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;
        char[] bin = printBinary(n).toCharArray();
        for(int i=0; i <= bin.length; i++){
            
            if(bin[i] == '1'){
               count += 1;
            } else if(bin[i] == '0'){ break; }
            
        }
        System.out.println(count);
        
    }
    
}
