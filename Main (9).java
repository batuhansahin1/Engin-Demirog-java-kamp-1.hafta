package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] mylist = { 8.7, 1.3, 4.3, 5.6 };
		double total = 0;
		double max=mylist[0];
		for (int a = 0; a < mylist.length; a++) {
			System.out.println(mylist[a]);

		}
		System.out.println("---------------");

		for (double number : mylist) {
			if(max<number) {
				max=number;
			}
			
			
			
			total += number;

			System.out.println(number);

		}
		
		System.out.println("Toplam:" + total);
		System.out.println("------------");
		System.out.println("En büyük:"+max);

		System.out.println("----------------------");
		if(max<mylist[1]) {
		
      max =mylist[1];
}
	if(max<mylist[2]) {
max=mylist[2];
}
	if(max<mylist[3]) {
		max=mylist[3];
	}
	
	System.out.println(max);
	}

}
