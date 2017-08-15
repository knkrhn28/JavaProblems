public class lesson9 {

	public static void main(String[] args) {
		int randomSayi = (int)(Math.random()*(1000)); //0 ile 1000 arasýnda sayý
        System.out.println("random sayi " + randomSayi); //üretilen sayýyý konsola bastýrdýk
 
        int birler = randomSayi %10; //birler basamaðý
 
        randomSayi = randomSayi /10; 
        int onlar = randomSayi %10;   //onlar basamaðý
        
        int yuzler = randomSayi /10;  //yüzler basamaðý
 
        System.out.println("Toplam= "+(birler+onlar+yuzler));
	}

}
