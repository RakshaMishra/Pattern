package com.kodnest.pattern;

public class StarPattern3 {
	public static void main(String[] args) {
		for(int j=1;j<=3;j++)
		{
			for(int i=1;i<=j+4;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
