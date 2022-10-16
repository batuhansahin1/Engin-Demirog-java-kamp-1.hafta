
package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {

		case 'A':
			System.out.println("Congrats you are doing well");
			System.out.println("There is no advice to give you");
			break;

		case 'B':
		case 'C':
			System.out.println(" You have passed the exam");
			System.out.println("Do little changes on your working plan");
			break;

		case 'D':
			System.out.println("You have passed the exam");
			System.out.println("I think you should take this class one more time ");
			break;

		case 'F':
			System.out.println("You failed the exam");
			System.out.println("You need to change your working system");
			break;

		default:
			System.out.println("You have entered an invalid note");

		}

	}

}
