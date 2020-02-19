package program1;

import java.util.Scanner;

public class PrintLetter {

	static{System.out.println("Enter the Words with number");}

	static Scanner input = new Scanner(System.in);
	static String s = input.next();

	static String alph[] = s.split("[^A-Za-z]");  // To split the alphabet letters and store this array 
	static String numb[] = s.split("[^0-9]");     // To split the number  and store this array
	static String numbws[] = new String[s.length()]; // To split the alphabet without space letters and store this array
	static String alphws[] = new String[s.length()]; // To split the number without and store this array


	static int i =0;


	static void print(String s,int n,String q[])
	{
		for(int j=0;j<n;j++)
		{	
			q[i++] = s;
		}
	}

	public static void main(String args[])
	{
		int g =0;   // array index
		int f =0;  // array index
		String s=""; 
		int n =0;
		int count =0;
		String[] q; // to store all values to this array.
		int arrray_length = 0;

		for(int k =0;k<alph.length;k++)
		{
			if(!alph[k].equals("")){

				alphws[f++] = alph[k];
			}
		}

		for(int k=0;k<numb.length;k++)
		{
			if(!numb[k].equals(""))
			{
				numbws[g++] = numb[k];    
			}
		}	

		for(int i = 0; i<g;i++)
		{
			arrray_length = arrray_length +Integer.parseInt("" + numbws[i]);

		}

		q = new String[arrray_length];

		for(int l =0;l<g;l++)
		{	
			s = alphws[l]; 
			n = Integer.parseInt("" + numbws[l]); 
			count = count +n;
			print(s,n,q);
		}

		for(int k=0;k<=q.length;k++)
		{
			if(count==k)
				break;
			System.out.print(q[k]);		
		}
	}
}