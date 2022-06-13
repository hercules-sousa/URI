import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String test = scanner.nextLine();

		Double num = Double.parseDouble(test);

		if (num >= 0 && num <= 25.0000) {
			System.out.println("Intervalo [0,25]");
		}
		else {
			if (num >= 25.00001 && num <= 50.0000) {
				System.out.println("Intervalo (25,50]");
			}
			else {
				if (num >= 50.00001 && num <= 75.0000) {
					System.out.println("Intervalo (50,75]");
				}
				else {
					if (num >= 75.00001 & num <= 100.0000) {
						System.out.println("Intervalo (75,100]");
					}
					else {
						System.out.println("Fora de intervalo");
					}
				}
			}
		}
	}

}
