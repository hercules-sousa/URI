import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner scanner = new Scanner(System.in);

		String[] numbers = scanner.nextLine().split(" ");

		float a = Float.parseFloat(numbers[0]);
		float b = Float.parseFloat(numbers[1]);
		float c = Float.parseFloat(numbers[2]);

		float delta = b * b - 4 * a * c;

		float x1;
		float x2;

		if (delta > 0) {
			System.out.println("Maior que 0");
			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			x2 = (-b - Math.sqrt(delta)) / 2 * a;
		}
		else {
			if (delta == 0) {
				x1 = -b / 2 * a;
				x2 = x1;
			}
			else {
				return;
			}
		}

		System.out.println(x1);
		System.out.println(x2);

    }
 
}
