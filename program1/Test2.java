package program1;

import java.util.Scanner;

public class Test2 {
	static{System.out.println("Enter the Words with number");}
	static Scanner s1 = new Scanner(System.in);
    static String s = s1.next();
	static String p[] = s.split("[^A-Za-z]");//{"cf","4","d","10"}; 
	static String t1[] = s.split("[^0-9]");
	static String t2[] = new String[1001];
	static String t3[] = new String[1001];
	static String q[] = new String[1001];
	static int i =0;
	static void print(String s,int n,String q[])
	{
for(int j=0;j<n;j++)
{	
	q[i++] = s;
	//System.out.print(q[j]);	
	}
}
public static void main(String args[])
	{
	int g =0;
	int f =0;
	for(int k =0;k<p.length;k++)
	{
		//System.out.println(p.length);
		//System.out.println(p[k]);
		if(!p[k].equals("")){
		t3[f++]=p[k];
		
	//	System.out.println(t3[k]);
		}
		}
	for(int k=0;k<t1.length;k++)
	{
		if(!t1[k].equals(""))
		{
			//System.out.println(" k" +k+"-" + t1[k]);
	    t2[g++]=t1[k];    
		}
	}
	
	for(int k=0;k<f;k++)
	{
		//System.out.print(t3[k] + " ");
	}
	
	for(int k=0;k<g;k++)
	{
		//System.out.print(t2[k]);
	}			
	    String s="";
		int n =0;
		int j=0;
		int count =0;
	for(int l =0;l<g;l++)
	{
		
		s = t3[l];
		//System.out.println(l++);	 
             n = Integer.parseInt("" + t2[l]); 
             count = count +n;
	//		System.out.println(s);
      //    System.out.println(n);
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