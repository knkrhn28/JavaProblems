package JavaLearn;

public class lesson10 {

	public static void main(String[] args)
	{	final int fak =10;
		for(int i = 0; i < fak; i++)
			System.out.println( i + "! is " + faktoriyel(i));
	}
	
	public static int faktoriyel(int n)
	{	int sonuc = 1;
		for(int i = 2; i <= n; i++)
			sonuc *= i;
		return sonuc;
	}

}
