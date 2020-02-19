package program3;

import java.util.Scanner;

public class NumberOfDays {

	/*  By this Method To find the initial Month and Current Month */

	static int month(int i)
	{
		if(i==4||i==6||i== 9||i==11)
		{
			return 30;
		}

		else if(i==2)
		{
			return 28;
		}

		else
		{
			return 31;
		}
	}

	/*  TO Split The String and Store in array
	 * */
	static String[] splits(String s) 
	{
		s = s.replaceAll("[^0-9]", " ");
		int j =0; String s1="";
		String ar[] = new String[s.length()];

		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i) ==' ')
			{
				j++;
				s1="";
			}
			else
			{
				s1 = s1 + s.charAt(i);
			}
			ar[j] = s1;
		}
		return ar;
	}     

	public static void main(String[] args) 
	{
		/* tm = start total month  tm1 = end total month, ly = leap year, ed = end date, sd = start date, sm = start month, sy = start year
		   em = end month, ey = end year, by = Difference between Start Year and End Year. 
		*/
		int tm=0,tm1=0,ly = 0; int ed, sd, sm, sy, em, ey, by, totalNoOfDays; 


		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Start Year: ");

		String s = input.nextLine();

		String[] arr = splits(s);

		sd = Integer.parseInt(""+(arr[0]));
		sm = Integer.parseInt(""+(arr[1]));  
		sy = Integer.parseInt(""+(arr[2]));

		sy++; // Start Year Increment Beacuse  go for Calculate the Start Year Days.

		sd = month(sm) - sd; // Difference Between From this Month Date to Start Date. 

		sm++; 

		for(int i = sm;i<=12;i++)
		{
			tm = tm + month(i);//Calculate the Days Based on Start Months Up to December Month 

		}

		tm = tm +sd; // add the total Months days and Start Month Days.

		System.out.print("Enter the End Year: ");

		String e = input.nextLine(); // c = current Date

		String arr1[] = splits(e);

		ed = Integer.parseInt("" +(arr1[0]));    
		em = Integer.parseInt("" +(arr1[1]));
		ey = Integer.parseInt("" +(arr1[2])); 
		em--;

		for(int i = 1;i<=em;i++)
		{
			tm1 = tm1 + month(i);

		}

		tm1 = tm1+ed;

		by = ey-sy; // Difference Between the Start and end year

		for(int i =sy;i<=ey;i++)
		{

			ly = leapyear(i) +ly;

		}

		totalNoOfDays = (by*365)+ly+tm+tm1;

		System.out.println("Total No Of Days from the Start Year to End Year: " + totalNoOfDays +" Days");

	}
	// By this Method Used to find the leap year.
	static int leapyear(int year) {
		if(year % 4 == 0)
		{
			if( year % 100 == 0)
			{
				if ( year % 400 == 0)
					return 1;
				else
					return 0;
			}
			else{
				return 1;
			}     
		}
		else {
			return 0;
		}

	}
}