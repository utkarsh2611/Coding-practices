import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String s = scan.nextLine();
        String s1;
        for(int i=0;i<t;i++) {
        s1 = scan.nextLine();
            for(int j=0;j<s1.length();j+=2) {
                
                System.out.print(s1.charAt(j));
            }
            
            System.out.print(" ");
            
    for(int k=1;k<s1.length();k+=2) {
                
                System.out.print(s1.charAt(k));
            }
            
            System.out.print("\n");
            
        }
    }    
}
    
