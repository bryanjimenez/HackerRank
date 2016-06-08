package hackerrank.challenges.manasa_and_stones;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {

			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();

			for (int i = 0; i < 2*(n-1); i++) {
				String binary = Integer.toBinaryString(i);
				System.out.println(binary);
				int sum =0;
				for(int j=0;j<n-1;j++){
					System.out.print(j);
					if(binary.length()<n-j){
						sum+=a;
					}else{
						System.out.println("b:"+binary.charAt(n-1-binary.length()-j));
						if(binary.charAt(n-1-binary.length()-j)=='0'){
							sum+=a;
						}else{
							sum+=b;
						}
					}
				}
				
				System.out.println("sum"+sum);
			}

		}

		in.close();
		return null;
	}
}