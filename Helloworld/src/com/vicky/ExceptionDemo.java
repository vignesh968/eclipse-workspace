package com.vicky;

public class ExceptionDemo {

	public static void main(String[] args) {
		try
		{
			int i,j;
			i=8;
			
			j=9;
			int k=i/j;
			if(k==0)
				throw new VickyException("  it not possible");
		}
		catch(VickyException e)
		{
			System.out.println("Error"+ e.getMessage());
		}
	}

}
