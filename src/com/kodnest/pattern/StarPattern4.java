package com.kodnest.pattern;

public class StarPattern4 {
	public static void main(String[] args) {
		for(int j=1;j<=4;j++)
		{
			for(int i=1;i<=4;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int j=1;j<=4;j++)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
