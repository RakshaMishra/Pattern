package com.kodnest.pattern;

public class StarPattern6 {
	public static void main(String[] args) {
		/*for(int j=1;j<=4;j++)
		{   
			for(int i=1;i<=4;i++)
			{    if((i==2 && j==3)||(i==3 && j==3) ||(i==3 && j==2)||(i==2 && j==2))
				{System.out.print(" ");}
			else
				System.out.print("*");
			
			
			}
			System.out.println();

}*/
		
		
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=5;i++)
			{
				if(i==1||j==1||i==5||j==3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}