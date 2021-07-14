package A20J_Ladder;

import java.util.*;

public class Problem_263A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row_target = 2;
		int coloumn_target =2;
		
		int row =0;
		int coloumn = 0;
		
		for(int i=0;i<5;i++) {
			String str = sc.nextLine().replace(" ", "");
			if(str.contains("1")) {
				row=i;
				coloumn = str.indexOf("1");
				break;
			}
		}
		
		System.out.println(Math.abs(coloumn_target-row)+Math.abs(row_target-coloumn));

	}

}
