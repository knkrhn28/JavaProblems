public class lesson9 {

	public static void main(String[] args) {
		int randomSayi = (int)(Math.random()*(1000)); //0 ile 1000 aras�nda say�
        System.out.println("random sayi " + randomSayi); //�retilen say�y� konsola bast�rd�k
 
        int birler = randomSayi %10; //birler basama��
 
        randomSayi = randomSayi /10; 
        int onlar = randomSayi %10;   //onlar basama��
        
        int yuzler = randomSayi /10;  //y�zler basama��
 
        System.out.println("Toplam= "+(birler+onlar+yuzler));
	}

}
