package org.array;

public class ArrayDemo 
{

public static void main(String[] args) 

{
	int age[]=new int[5];
	
	age[0]=10;
	age[1]=15;
	age[2]=25;
	age[3]=55;
	age[4]=35;
	
	for (int i=0;i< age.length;i++ )
	{
		System.out.println(age[i]);
	}
	
}	

}
