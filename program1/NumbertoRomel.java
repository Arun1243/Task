package program1;

import java.util.Scanner;

public class NumbertoRomel {

	// By this Method to find main Digit and store array. 

	static int digit (char ch,int n, int i, char[] c)
	{
		for(int j =0; j<n; j++)
		{
			c[i] = ch;
			i++;
		}


		return i;
	}

	// By this method to find the subdigit and store array.

	static int subdigit(char c1, char c2, int i, char[]c)
	{
		c[i] = c1;
		i++;
		c[i] = c2;
		i++;
		return i;
	}

	// By this below method Number to romel Conversion. 

	static int numbertoromel(int n)
	{
		int i =0;
		char c[] = new char[1000];

		// To Check conditions depend upon the numbers.

		while(n !=0){

			if(n >= 1000)
			{
				i = digit('M',n/1000,i,c);
				n = n%1000;
			}

			else if(n > 500)
			{
				if(n<900)
				{
					i = digit('D',n/500,i,c);
					n = n%500;
				}
				else
				{
					i = subdigit('C','M',i,c);
					n = n%100;
				}
			}

			else if(n >=100)
			{
				if(n < 400)
				{
					i = digit('C',n/100,i,c);
					n = n%100;
				}
				else
				{
					i = subdigit('C','D',i,c);
					n = n%100;
				}
			}

			else if(n >= 50)
			{
				if(n<90)
				{
					i = digit('L',n/50,i,c);
					n = n%50;
				}
				else
				{
					i = subdigit('X','C',i,c);
					n = n%10;
				}
			}

			else if(n>=10)
			{
				if(n<40)
				{
					i = digit('X',n/10,i,c);
					n = n%10;
				}

				else
				{
					i = subdigit('X','L',i,c);
					n = n%10;
				}
			}

			else if(n>=5)
			{
				if(n<9)
				{
					i = digit('V',n/5,i,c);
					n=n%5;
				}

				else
				{
					i = subdigit('I','X',i,c);
					n =0;
				}
			}

			else if(n >=1)
			{
				if(n<4)
				{
					i = digit('I',n,i,c);
					n =0; 
				}
				else
				{
					i = subdigit('I','V',i,c);
					n=0;
				}

			}

		}

		System.out.print("The given number romel form is ");

		// To print the array.

		for(int k =0; k<c.length; k++ )
		{
			System.out.print(c[k]);
		}


		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		numbertoromel(n);



	}

}


