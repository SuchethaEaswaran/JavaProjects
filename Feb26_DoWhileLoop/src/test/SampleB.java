package test;

import java.util.Scanner;

public class SampleB {

	public static void main(String[] args) {
		int a=1;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the table value:");
		int tbl=scan.nextInt();
		
		do
		{
			System.out.print(a);
			System.out.print("x");
			System.out.print(tbl);
			System.out.print("=");
			System.out.println(a*tbl);
			a++;
			
		}
		while(a<=10);
		scan.close();
	}

}
