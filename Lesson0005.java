package JavaEducation;
public class Lesson0005 {
	public static void main(String[] args) {
		double[] liste= {1.9, 2.9, 3.4, 3.5};
		for (int i=0;i<liste.length;i++) {
			System.out.println(liste[i]+" ");			
		}
		double total = 0;
	      for (int i = 0; i < liste.length; i++) {
	         total += liste[i];
	      }
	      System.out.println("toplam: " + total);
	      double max = liste[0];
	      for (int i = 1; i < liste.length; i++) {
	         if (liste[i] > max) max = liste[i];
	      }
	      System.out.println("Maximum:" + max);
	}
}
