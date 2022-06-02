import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
class Main {
 
    public static void main(String[] args) throws IOException {
		final double THRESHOLD = .00001;
 
		Scanner scanner = new Scanner(System.in);

		String[] splittedLine = scanner.nextLine().split(" ");
		String[] numbers = new String[3];
		int pos = 0;
		for (int i = 0; i < splittedLine.length; i++) {
			if (!splittedLine[i].isEmpty()) {
				numbers[pos] = splittedLine[i];
				pos++;
			}
		}

		double a = Double.parseDouble(numbers[0]);
		double b = Double.parseDouble(numbers[1]);
		double c = Double.parseDouble(numbers[2]);

		if (Math.abs(a) < THRESHOLD) {
			System.out.println("Impossivel calcular");
			return;
		}

		double delta = b * b - 4 * a * c;

		double x1;
		double x2;

		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
		}
		else {
			if (delta == 0) {
				x1 = -b / (2 * a);
				x2 = x1;
			}
			else {
				System.out.println("Impossivel calcular");
				return;
			}
		}

		System.out.printf("R1 = %.5f\n", x1);
		System.out.printf("R2 = %.5f\n", x2);

    }
 
}
