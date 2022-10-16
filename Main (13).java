package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'I';
		/*
		 * char[] kalın = {'a', 'ı', 'u', 'o', 'A', 'U', 'O', 'I'}; char[] ince = {'e',
		 * 'i', 'ü', 'ö', 'E', 'Ü', 'Ö', 'İ'}; if(harf== kalın[harf]) {
		 * System.out.println("kalın ünlü girdiniz");
		 * 
		 * } if(harf== ince[harf]) { System.out.println("İnce ünlü girdiniz");
		 * 
		 * } if(harf!=ince[harf] &&harf!= kalın[harf]) {
		 * System.out.println("Geçersiz harf girdiniz"); }
		 * 
		 */
		switch (harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
			default:
				System.out.println("İNCE SESLİ HARF");
		}

	}

}
