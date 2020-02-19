package program3;

public class WaterStorage 
{
	public static void main(String args[])
	{
		int a1[] = {7,0,4,2,5,0,6,4,0,5};
		/* d = diffewrence between final number and initial number vice versa
             count = To count total number of water blocks obtained*/
		int count=0,d;  
		int l = a1.length-1;
		int fn=0;// fn = final number
		int in=0; // in = initial number

		// initial number
		for(int i =0;i<a1.length;i++)
		{
			if(i+1<a1.length)
			{
				if(a1[i]>a1[i+1])
				{
					in=i;
					break;

				}
			}
		}
		/* To find the Final number in Array last element */
		for(int i =l;i>=0;i--)
		{
			if(i-1 >=0)
			{
				if(a1[i]>a1[i-1])
				{  
					fn=i;
					break;

				}
			}
		}

		/*    if initial number and final number is equal and go for this method   */

		if(a1[fn]==a1[in])
		{

			for(int i =in;i<fn;i++)
			{
				d = a1[fn] - a1[i];
				count = count + d;

			}

		}

		/*    if Final number is greater than to initial number and go for this method   */

		if(a1[fn]<a1[in])
		{
			for(int i=fn;i>=in;i--)
			{

				if(a1[fn]>a1[i])
				{
					d = a1[fn] - a1[i];
					count = count + d;
				}

				else if(a1[fn]<a1[i])
				{
					a1[fn] = a1[i];
				}
			}

		}

		/*    if Final number is less than to initial number  and go for this method   */

		else if(a1[fn]>a1[in])
		{
			for(int i =in;i<=fn;i++)
			{
				if(a1[in]>a1[i])
				{
					d=a1[in]-a1[i];
					count = count + d;
				}
				else if(a1[in]<a1[i])
				{
					a1[in] = a1[i];
				} 	
			}
		}

		System.out.println("The obtained Water Blocks are "+ count);
	}
}
