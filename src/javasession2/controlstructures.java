package javasession2;

import java.util.Scanner;

public class controlstructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*System.out.println("hello world");
		
		int a=10;
		int b=10;
		int c=a+b;
		
		
		System.out.println(" the result is : "+c);*/
		System.out.println("enter age of the person");
		Scanner inputReader = new Scanner(System.in);
		int age = inputReader.nextInt();
		
		if(age>=18){
			System.out.println("person is eligible to vote");
			
		}
		else
		{
			System.out.println("person is not eligible to vote");
		}
	}
}


