package intro;

public class Main {

	public static void main(String[] args) {
        System.out.println("Hello world!");
		
        
        //değişken isimlendirmeleri java'da camelCase yazılır
        String ortaMetin ="Ilginizi cekebilir";
        String altMetin	="Vade süresi";
        
        
        System.out.println(ortaMetin);
        System.out.println(altMetin);
        
        //integer
        int vade = 12;
        
        double dolarDün= 18.25;
        double dolarBugün =18.30;
      
        // boolean mantıksal veri tipleri
        boolean dolarDustumu = false;
        
        String okYonu ="";
        
        if (dolarBugün<dolarDün) {//false
        	                      
        	okYonu ="down.svg";
        	System.out.println(okYonu);
        	
		} else if(dolarBugün>dolarDün) {
			okYonu ="up.svg";
    	System.out.println(okYonu);
		}
			else {
			okYonu ="equal.svg";
        	System.out.println(okYonu);

		}
        //array
        String[] krediler = {"Hızlı kredi","Maaşını Halkbanktan","Mutlu Emekli","Maaşını Halkbanktan","Mutlu Emekli","Maaşını Halkbanktan","Mutlu Emekli","Maaşını Halkbanktan","Mutlu Emekli","Maaşını Halkbanktan","Mutlu Emekli","Maaşını Halkbanktan","Mutlu Emekli","Maaşını Halkbanktan","Mutlu Emekli","Maaşını Halkbanktan","Mutlu Emekli"};
	    System.out.println(krediler[0]);
	    System.out.println(krediler[1]);
	    System.out.println(krediler[2]);
	    
	    for (int   i= 0;  i< krediler.length;  i++) {
			System.out.println(krediler[i]);
	    	
	    	
		}


	}

}
