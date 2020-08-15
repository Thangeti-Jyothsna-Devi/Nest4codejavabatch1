package nest4codeday1;

import java.util.Scanner;

public class assignment1 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Price1:");
		float price1=input.nextFloat();
		System.out.print("Price2:");
		float price2=input.nextFloat();
		System.out.print("Price3:");
		float price3=input.nextFloat();
		System.out.print("Tax %:");
		float tax=input.nextFloat();
		float total=price1+price2+price3;
		float total_tax=(tax/100)*total;
		float final_amount=total+total_tax;
		System.out.print("Final Amount:"+final_amount);
		input.close();
	}

}
