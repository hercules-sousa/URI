import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();

		while (!line.equals("0 0")) {
			String[] splittedLine = line.split(" ");
			String missingLetter = splittedLine[0];
			String numberToCheck = splittedLine[1];
			String answer = new String("");

			Boolean skipZero = true;

			for (int i = 0; i < numberToCheck.length(); i++) {
				if (skipZero) {
					if (numberToCheck.charAt(i) != '0' && !missingLetter.equals(numberToCheck.substring(i, i + 1))) {
						answer += numberToCheck.charAt(i);
						skipZero = false;
					}
				}
				else {
					if (!missingLetter.equals(numberToCheck.substring(i, i + 1))) {
						answer += numberToCheck.charAt(i);
					}
				}
			}

			if (answer.equals("")) {
				answer = "0";
			}

			System.out.println(answer);

			line = scanner.nextLine();
		}
	}
}
