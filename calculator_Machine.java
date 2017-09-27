package CalculatorMachine;
import java.util.Scanner;
public class calculator_Machine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		double number1,number2,result,select;
		System.out.println("Islem Seciniz");
		System.out.println("1-Toplama\n" + "2-Cikarma\n"+ "3-Carpma\n" + "4-Bolme\n");
		select=input.nextInt();
		if(select==1) {
			System.out.println("Number One Please: ");
			number1=input.nextDouble();
			System.out.println("Number Two Please: ");
			number2=input.nextDouble();
			result=number1+number2;
			System.out.println("Sum Result: "+result);
		}
		else if(select==2) {
			System.out.println("Number One Please: ");
			number1=input.nextDouble();
			System.out.println("Number Two Please: ");
			number2=input.nextDouble();
			result=number1-number2;
			System.out.println("Ex Result: "+result);
		}
		else if(select==3) {
			System.out.println("Number One Please: ");
			number1=input.nextDouble();
			System.out.println("Number Two Please: ");
			number2=input.nextDouble();
			result=number1*number2;
			System.out.println("Çarpma Result: "+result);
		}
		else if(select==4) {
			System.out.println("Number One Please: ");
			number1=input.nextDouble();
			System.out.println("Number Two Please: ");
			number2=input.nextDouble();
			result=(double)number1/(double)number2;
			System.out.println("Ex Result: "+result);
		}
		else {
			System.out.println("Error Select");
		}
	}
}
