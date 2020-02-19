package program1;

import java.util.Scanner;

public class math {


	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in); 
		int s = input.nextInt();
		int v =s;
		int a = 0;
		int f1 =0;
		int count = 0;
		int sum =0;
		
		// To find the array length
		
		while (s>0)
		{
			a = s%10; 
			count++;
			s = s/10;
		}

		int b[] = new int[count];
		int l = b.length -1;
		
		// To Copy the values in the array
		
		while (v>0)
		{
			b[l] = v%10; 
			l--;
			v = v/10;
		}
		

		for(int f =0; f<b.length;f++)
		{
			f1 = f+1;
			if(f1<b.length)
			{
				sum = sum +(int)Math.pow(b[f], b[f1]);
			}

			if(f1==b.length)
			{
				f1=0;
			    sum = sum + (int)Math.pow(b[f], b[f1]);
			}
		}



		System.out.println(sum);



	}

}
