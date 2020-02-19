package program1;

import java.util.Scanner;

public class RomelToNumber {

	// to Store number value in individual Alphabets

	int val(char c)
	{
		if(c=='I')
		{
			return 1;
		}

		if(c=='V')
		{
			return 5;
		}

		if(c=='X')
		{
			return 10;
		}

		if(c=='L')
		{
			return 50;
		}

		if(c=='C')
		{
			return 100;
		}

		if(c=='D')
		{
			return 500;
		}

		if(c=='M')
		{
			return 1000;
		}
		return 0;
	}

	// Conversion in Romel into Number

	int conv (String s)
	{
		int sum =0;
		for(int i =0; i<s.length();i++)
		{
			int s1 = val(s.charAt(i));
			if(i+1 < s.length())
			{
				int s2 = val(s.charAt(i+1));
				if(s1 >= s2)
				{
					sum = sum + s1;
				}
				else
				{
					sum = sum + s2-s1;
					i++;
				}
			}
			else{

				sum = sum + s1;
				//i++;
			}
		}
		return sum;

	}

	public static void main(String[] args) {


		RomelToNumber rn = new RomelToNumber();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Romel Numbers");
		String s = input.nextLine();

		s = s.toUpperCase();

		int print = rn.conv(s);

		System.out.println(" The given Romel Converted into Number is " + print);
	}
}
