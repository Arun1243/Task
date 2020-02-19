package program1method2;
import java.util.Scanner;

public class PrintThenextNumber1 {


	//By This Method Split the number and Store the array.

	static String[] splitnumber(String str) 
	{ 
		String []num = new String[0];
		
		String s="";

		for (int i=0; i<str.length(); i++) 
		{ 

			if (Character.isDigit(str.charAt(i))) 
			{
				   s=s+String.valueOf(str.charAt(i));
				
			    if(i+1<str.length()&&Character.isDigit(str.charAt(i+1)))
				     	continue;
				
				String[] temp = new String[num.length+1];
				
				temp[temp.length-1]=s;
				
				for(int j=0;j<num.length;j++)
				{
					temp[j]=num[j];
				}

				num = temp;
			}
			
			    s="";	     
		} 
		
		return num;     

	} 

	//By This Method Split the letter and Store the array.

	static String[] splitletter(String str) 
	{ 
		String []letter=new String[0];
		String s="";
		
		for (int i=0; i<str.length(); i++) 
		{ 

			if (Character.isAlphabetic(str.charAt(i))) 
			{	
			    	s=s+String.valueOf(str.charAt(i));
			
		     	if(i+1<str.length()&&Character.isAlphabetic(str.charAt(i+1)))
				    continue;
		     	
			    String[] temp = new String[letter.length+1];
			    
			    temp[temp.length-1]=s;
			//System.out.println(temp.length);
	
			    for(int j=0;j<letter.length;j++)
			    {
			    	temp[j] = letter[j];
			    }
			
			    letter=temp;
			}
			 
			    s="";
		} 


		return letter;     

	}
	

	public static void main(String[] args) {

		System.out.println("Enter the letters With Number: ");
		Scanner input = new Scanner(System.in);
		String value=input.next();
	

		String letter[] = splitletter(value);
		String number[] = splitnumber(value);

		//Print the array values.

		for(int i=0;i<letter.length;i++)
		{
			int n = Integer.valueOf(number[i]);

			for(int j=0;j<n;j++)
			{
				System.out.print(letter[i]);
			}

		}
	}
}


