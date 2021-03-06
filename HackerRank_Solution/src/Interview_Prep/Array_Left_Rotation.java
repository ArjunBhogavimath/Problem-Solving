package Interview_Prep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Array_Left_Rotation {
	static int[] rotLeft(int[] a, int d) {
        
	       
	       int size = a.length;
	        int rotated_arr[] = new int[size];
	       int rotated_index = d;
	       int i =0;
	       
	       while(rotated_index<size){
	           rotated_arr[i] = a[rotated_index];
	           rotated_index++;
	           i++;
	       }
	       
	       rotated_index=0;
	       
	       while(rotated_index<d){
	           rotated_arr[i] = a[rotated_index];
	           rotated_index++;
	           i++;
	       }
	       
	       return rotated_arr;
	        


	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        int[] result = rotLeft(a, d);

	        for (int i = 0; i < result.length; i++) {
	            bufferedWriter.write(String.valueOf(result[i]));

	            if (i != result.length - 1) {
	                bufferedWriter.write(" ");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }

}
