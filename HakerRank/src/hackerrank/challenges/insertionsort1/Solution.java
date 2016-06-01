package hackerrank.challenges.insertionsort1;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/insertionsort1
 * @author bxj62
 *
 */
public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int last = ar[ar.length-1];
        boolean inserted = false;
        for(int i=ar.length-2;i>-1;i--){
            if(ar[i]>last){
                ar[i+1]=ar[i];
            }else{
                ar[i+1]=last;
                inserted=true;
            }
            printArray(ar);

            if(inserted==true){
            	break;
            }
        }
        if(inserted==false){
        	ar[0]=last;
            printArray(ar);
        }
        
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
        in.close();
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
