 package Geek;
import java.util.Scanner;
public class Fak {
	static int fak(int n) {
		if (n==0) {
			return 1;
		}
		return n*fak(n-1);
	}
	public static void main(String[] args) {
		try(Scanner kutu=new Scanner(System.in);) 
		{
			int number;
			System.out.println("Faktoriyeli alinacak sayiyi giriniz:");
			number = kutu.nextInt();
			System.out.println(fak(number));
		}catch(Exception ex) {
			ex.printStackTrace();
		}		
	}
}
