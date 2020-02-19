package program2;

import java.util.Scanner;

class pragraph
{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Paragraph");
		String s = input.nextLine() ;

		String[] s1 = s.split("\\s");
		String[] s2 = new String[s1.length];
		String[] ns = new String[s.length()];

		int count=0;
		int count1=0;

		String s4="";
		int k =0;

		for(int i =0; i<s1.length;i++)
		{
			count = 1;
			{
				for(int j =i+1; j<s1.length;j++)
				{
					if(s1[i].equals(s1[j]))
					{
						s4 = s1[i];
						s1[j] ="";
						count++;
					}
				}
				if(s4!="")
					s4 = count+" "+s4;

			}
			s2[k++] = s4;
			s4 = "";

		}

		for(int m=0;m<k;m++)
		{
			if(!s2[m].equals(""))
			{
				ns[count1++] = s2[m];
			}
		}

		String temp="";
		for(int m=0;m<count1;m++)
		{
			for(int n=m+1;n<count1;n++)
			{
				if(Integer.parseInt(""+ns[m].charAt(0))<Integer.parseInt(""+ns[n].charAt(0)))
				{
					temp = ns[m];
					ns[m] = ns[n];
					ns[n] = temp;
				}
			}
		}

		count1=5;
		for(int z =0;z<count1;z++)
		{
			System.out.println(ns[z] +" ");
		}

	}



}