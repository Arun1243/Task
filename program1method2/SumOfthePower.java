package program1method2;

import java.util.Scanner;

public class SumOfthePower {


	public static void main(String[] args) {

		int sum =1; int total =0;

		System.out.println("Enter the number: ");

		Scanner input = new Scanner(System.in); 

		// taken the number input in string form

		String num = input.next();

		// Converted String into Integer

		int number = Integer.parseInt("" + num);

		int arr[] = new int[num.length()];

		//By This below loop to store value in array

		for(int i=arr.length-1; i >= 0; i--)
		{
			arr[i] = (number % 10);

			number = number/10;

		}


		for(int i =0; i < arr.length; i++ )
		{   
			int j = i+1;

			j = i+1 < arr.length ? j : 0; // ternary function 

			for(int k =0; k < arr[j]; k++  )
			{
				sum =  sum * arr[i];
			}
			total = total+sum;
			sum =1;
		}

		System.out.println(total);


	}

}
