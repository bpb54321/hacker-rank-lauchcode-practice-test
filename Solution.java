import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

/*
 * Complete the function below.
 */

    static void countUp(int start) {
        
        String outputString=String.valueOf(start+1);
        for (int i=2; i<=10; i++) {
            int nextNumber=start+i;
            outputString+=" then "+ nextNumber; 
          
        }
        System.out.println(outputString);


    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _start;
        _start = Integer.parseInt(in.nextLine());
        
        countUp(_start);
        
    }













}