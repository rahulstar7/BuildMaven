package com.buildmaven.add;

public class PrimeNumber {

	
	public static void main(String[] args) {
		boolean prime = isPrime(7);
		System.out.println(prime);
	}
	
	public static boolean isPrime(int number)
	{
		if(number <= 1)
		{
			return false;
		}
		
		
		
		for(int i=2;i<number;i++)
		{
			//if the number is divisible by i,it's not prime
			
			if(number % i ==0)
			{
				return false;
			}
			
		}
		return true;
	}
}
