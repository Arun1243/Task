package program3;

import java.util.Scanner;

public class ReverseSpiralMatrix {


	public static void main(String[] arrgs) {
		// TODO Auto-generated method stub
		
		// r = row, c = column, k = array index, x = x-axis, y = y-axis.  
		
		int r=0,c=0,k=0,x=0,y=0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the No. Of Row and Column in Matrix  ");

		int m = input.nextInt(); // m = no. Of Rows
		int n = input.nextInt(); // n = no. Of Columns

		int arr[][] = new int[m][n];
		int arv[] = new int[m*n]; // arv = to store reverse arrays value 


		r = m-1; c = n-1;

		System.out.println("Enter the values for "+m+"X"+n+" Matrix");
		
		// To get mxn Values Via Scanner. 

		for(int i =0;i<=r;i++)
		{
			for(int j =0;j<=c;j++)
			{
				arr[i][j] = input.nextInt(); 
			}
		}

		while(x<=r && y<=c)
		{
			
			for(int i=y;i<=c;i++)
			{
				arv[k++] = arr[x][i];
			}	
			x++;

			for(int i=x; i<=r; i++)
			{
				arv[k++] = arr[i][c];

			}	
			c--;
			
			if(x<=r)
			{	
				for(int i=c; i>=y; i--)
				{
					arv[k++] = arr[r][i];
				}
			}
			r--;
			
			if(y<=c)
			{
				for(int i=r; i>=x; i--)
				{
					arv[k++] = arr[i][y];
				}
			}
			y++;
		}

		System.out.println("The Center to Outer Values are: ");	       
		// To print the reverse Values
		
		for(int i=arv.length-1;i>=0;i--)
		{
			System.out.print(arv[i] + " ");
		}



	}	

}
