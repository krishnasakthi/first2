package com.met;

class parent
{
	int a=10;
	int b=20;
}

class child extends parent
{
	int a=50;
	int b=100;
	
	void mobile()
	{
		int a=500;
		int b=300;
		
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
		
	}
}


public class Test 
{
	
	public static void main(String args[])
	{
       child c=new child();
       
       c.mobile();
	}

	
}
