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
		Scanner kutu=new Scanner(System.in);
		int number;
		System.out.println("Number Enterance: ");
		number = kutu.nextInt();
		System.out.println(fak(number));
	}

}
