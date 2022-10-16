package arkadasSayılar;

public class Main {

	public static void main(String[] args) {
		
		/* kendileri hariç birbirinin pozitif tam bölenlerinin toplamı birbirine eşit olan
		 sayılara arkadaş sayılar denir
		 */
		/* 220-284
		 * 220:1+2+4+5+10+11+20+22+44+55+110=284
		 * 284:1+2+4+71+142=220
		 */
		
		int number1=220;
		int number2=284;
		int sum1=0;
		int sum2=0;
		
		
		for(int i=1;i<number1;i++) {
		if(number1%i==0) {
			
			sum1=sum1+i;
			
		}
		
		}
		
		
		
		
		for(int i=1;i<number2;i++) {
			if(number2%i==0) {
				sum2=sum2+i;
				
			}
			
		}
		
		
		
		if(sum1==number2 &&sum2==number1) {
			
			System.out.println("Girdiginiz sayilar arkadaştır");
		}else {
			System.out.println("Girdiginiz sayilar arkadaş değildir");

		}
	
	}

}
