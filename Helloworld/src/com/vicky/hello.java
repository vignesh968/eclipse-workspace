package com.vicky;

import java.util.Scanner;

	class Calc
	{
	    int num1=3;
	    int num2=5;
	    int result;                          
	    public void perform(int j ,int k)  //method
	    {
	        result=j+k;
	    }
	}
	public class hello
	{
	    public static void main(String[] args)
	    {
	        Calc obj=new Calc();
	       obj.perform(4,7);
	        System.out.println(obj.result);
	    }
	}
