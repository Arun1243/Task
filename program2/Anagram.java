package program2;

import java.util.Scanner;
// anagram
public class Anagram {

	// sort method using for sort character

	public static void sort(char[] c) {

		char temp ;
		for(int i =0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
	}


	static boolean ana(String str1,String str2)
	{
		String s1 = str1;
		String s2 = str2;

		char c1[] = s1.toLowerCase().toCharArray();
		char c2[] = s2.toLowerCase().toCharArray();

		sort(c1);
		sort(c2);

		for(int i =0;i<c2.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				return false;	
			}
		}
		return true;
	}

	public static void main(String args[])
	{

		System.out.println("Enter the Paragraph to check the Anagram or not");

		Scanner input = new Scanner(System.in);
		String s3="";int k = 0,count1 = 0; // k, c = array index 
		String s =input.nextLine();
		String s1[] = s.split(" "); // Element Split and Store Arrays
		String[] arr = new String[s.length()];
		String[] ss= new String[s.length()];

		System.out.println("From the given Paragraph Anagram Words are");

		for(int i =0;i<s1.length;i++)
		{
			for(int j =i+1;j<s1.length;j++)
			{
				String s2 = s1[i];
				if(i==s1.length-1)
				{
					j=0;
					s3 = s1[j];
				}
				else 
				{
					s3 = s1[j];
				}
				if(s2.length()==s3.length() && !s2.equals(s3))
				{
					if(ana(s2,s3))
					{
						ss[k++]=s2;
						ss[k++]=s3;
						s3 = " ";
					}
				}
			}
		}

		for(int m=0;m<k;m++)
		{ 
			for(int n=m+1;n<k;n++)
			{
				if(ss[m].equals(ss[n]))
				{
					ss[n]="";
				}
			}
		}

		for(int m=0;m<k;m++)
		{
			if(!ss[m].equals(""))
			{
				arr[count1++] = ss[m];
			}
		}

		// To Print the Array.

		for(int z=0;z<count1;z++)
		{
			System.out.println(arr[z]+" ");
		}
	}
}


