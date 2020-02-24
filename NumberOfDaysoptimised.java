package program3method2;

import java.util.Scanner;

public class NumberOfDaysoptimised {

	/* By this Method To find the initial Month and Current Month */

	static int month(int i) {
		int j = (i == 4 || i == 6 || i == 9 || i == 11) ? 30 : (i == 2) ? 28 : 31;
		return j;
	}

	/* TO Split The String and Store in startDateay */

	static String[] splits(String string) {
		string = string.replaceAll("[^0-9]", " ");
		int j = 0;
		String temp = "";
		String split[] = new String[string.length()];

		for (int i = 0; i < string.length(); i++) 
		{
			if (string.charAt(i) == ' ') 
			{
				j++;
				temp = "";
			} else {
				temp = temp + string.charAt(i);
			}
			split[j] = temp;
		}
		return split;
	}
	// By this Method Used to find the leap year and Ternary function Used.
	static int leapyear(int year) 
	{
		int i = (year % 4 == 0) ? (year % 100 == 0) ? (year % 400 == 0) ? 1 : 0 : 1 : 0;
		return i;
	}

	public static void main(String[] args) {

		int startMonTotal = 0, endMonTotal = 0, leapYearCount = 0;
		int ed, sd, sm, sy, em, ey, by, totalNoOfDays;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Start Year: ");

		String string = input.nextLine();

		String[] startDate = splits(string);

		sd = Integer.parseInt("" + (startDate[0]));
		sm = Integer.parseInt("" + (startDate[1]));
		sy = Integer.parseInt("" + (startDate[2]));

		sy++; // Start Year Increment Beacuse go for Calculate the Start Year

		sd = month(sm) - sd; // Difference Between From Month Date to Start Date.

		sm++;

		for (int i = sm; i <= 12; i++) 
		{
			startMonTotal = startMonTotal + month(i);// Calculate the Days Based on Start Months Up to December Month
		}

		startMonTotal = startMonTotal + sd; // add the total Months days and Start Month Days.

		System.out.print("Enter the End Year: ");

		String e = input.nextLine(); // c = current Date

		String endDate[] = splits(e);

		ed = Integer.parseInt("" + (endDate[0]));
		em = Integer.parseInt("" + (endDate[1]));
		ey = Integer.parseInt("" + (endDate[2]));
		em--;

		for (int i = 1; i <= em; i++) {
			endMonTotal = endMonTotal + month(i);

		}

		endMonTotal = endMonTotal + ed;

		by = ey - sy; // Difference Between the Start and end year

		for (int i = sy; i <= ey; i++) {

			leapYearCount = leapyear(i) + leapYearCount;

		}

		totalNoOfDays = (by * 365) + leapYearCount + endMonTotal + startMonTotal;

		System.out.println("Total No Of Days from the Start Year to End Year: "+ totalNoOfDays + " Days");
	}
}