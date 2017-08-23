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
		// TODO Auto-generated method stub

	}

}
