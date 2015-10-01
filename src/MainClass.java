import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Guess the number i;m thinking of. It's between 1-10");
		Scanner keyboard = new Scanner(System.in);

		int number1 = 0 + (int) ( Math.random() * 10 );
		int input = 0;
		 

			do	
			{
				input = keyboard.nextInt();

				if (input == number1)
					System.out.println("You're right.");
				else if(input != number1)
				{	

					System.out.println("You're wrong");

					if (input < number1)
						System.out.println("Number to small");
				}	
				else
				{
					System.out.println("Number too big");
				}

			}
	while (input != number1);
	}
	
}