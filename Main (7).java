package loopDemo;

public class Main {

	public static void main(String[] args) {
//for
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);

			// * i++=(i=i+1)*//
			// * (i+=2)=(i=i+2)*//

		}
		System.out.println("For döngüsü bitti");

		// while
		int i = 2;
		while (i < 10) {
			System.out.println(i);

			i += 2;
		}
		System.out.println("While döngüsü bitti");

		// do-while döngüsü
		int j = 100;
		do {
			System.out.println("loglandı");
			
			System.out.println(j);

			j += 2;
		} while (j < 10);
		System.out.println("Do-while döngüsü bitti");

	}

}
