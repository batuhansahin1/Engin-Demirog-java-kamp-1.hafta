package sayiBulma;

public class Main {

	public static void main(String[] args) {
	
		int[] sayilar= new int[] {1,2,5,7,9,0};
		int aranacak =5;
		boolean varMi=false;
		/*for(int i:sayilar) {
			
					
					if(i==aranacak) {
						System.out.println("Aradiginiz sayi:"+i );
						
						
					}
					
		
		}*/
	for(int i: sayilar) {
		if(i==aranacak) {
			varMi=true;
			break;
		}
	}
		
		
		if(varMi) {
			System.out.println("Sayi mevcuttur");
			
		}else {
			System.out.println("Sayi mevcut degildir");
		}
	}

}
