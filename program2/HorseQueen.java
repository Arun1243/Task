package program2;

import java.util.Scanner;

public class HorseQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the value for qR: ");
		int qR = s.nextInt();
		
		System.out.print("Enter the value for qC: ");
		int qC = s.nextInt();
		
		System.out.print("Enter the value for hR: ");
		int hR = s.nextInt();
		
		System.out.print("Enter the value for Hc: ");
		int hC = s.nextInt();

		if((qC-qR)==(hC-hR) || qR==hR || qC==hC || (qR+qC)==(hR+hC)|| ((hR-2)==qR && (((hC-1) == qC)||(hC+1)==qC)) || ((hR-1)==qR && (((hC-2)==qC)||(hC+2) == qC))  || ((hR+1)==qR && (((hC+2)==qC)||(hC-2)==qC)) || ((hR+2) == qR && (((hC+1)==qC)||(hC-1)==qC))) 
		{
			System.out.println("From the given Value The queen and Horse Cut each other");
		}
		else{
			System.out.println("From the given Value The queen and Horse Cut not each other");
		}
	}

}
