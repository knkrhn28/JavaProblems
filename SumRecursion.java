package Geek;
import java.util.Scanner;
public class Toplam{
	static int toplama(int n) {
		if (n==0) {
			return 0;
		}
		return n+toplama(n-1);
	}
	public static void main(String[] args) {
		Scanner kutu=new Scanner(System.in);
		int number;
		System.out.println("Number Enterance: ");
		number = kutu.nextInt();
		System.out.println(toplama(number));
	}

}
