package JavaEducation;
public class Lesson0010 {
	static void bubbleSort(int[]dizi) {
		int uzunluk=dizi.length;
		int temp=0;
		for(int i=0;i<uzunluk;i++) {
			for(int j=1;j<(uzunluk-i);j++) {
				if(dizi[j-1]>dizi[j]) {
					temp=dizi[j-1];
					dizi[j-1]=dizi[j];
					dizi[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		 int dizi[] ={3,60,35,2,45,320,5};  
         System.out.println("Sýrasýz Dizi:");  
         for(int i=0; i < dizi.length; i++){  
                 System.out.print(dizi[i] + " ");  
         }  
         System.out.println();  
         bubbleSort(dizi);
         System.out.println("Sýralý Dizi:");  
         for(int i=0; i < dizi.length; i++){  
                 System.out.print(dizi[i] + " ");  
         }  
	}
}
