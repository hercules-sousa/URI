import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		System.out.println("Aôba");
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();

		while (!line.equals("0 0")) {
			String[] splittedLine = line.split(" ");
			String missingLetter = splittedLine[0];
			String numberToCheck = splittedLine[1];
			String answer = new String();

			Boolean skipZero = true;

			for (int i = 0; i < numberToCheck.length(); i++) {
				if (skipZero) {
					if ()
				}
			}

			line = scanner.nextLine();
		}
	}
}
