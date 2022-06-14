import java.util.Scanner;

class Main {
	public static long power(long num, int p) {
		if (p == 0) return 1;
		if (p == 1) return num;

		long n = num;

		for (int i = 0; i < p - 1; i++) {
			n = n * num;
		}

		return n;
	}

	public static String convertToBinary(long num) {
		StringBuilder binary = new StringBuilder();

		if (num == 0 || num == 1) {
			binary.append(num);
			
			return binary.toString();
		}

		while (num != 1) {
			binary.append(num % 2);

			num = num / 2;
		}

		binary.append(num);

		return binary.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String[] inputs = scanner.nextLine().split(" ");
			long n1 = Long.parseLong(inputs[0]);
			long n2 = Long.parseLong(inputs[1]);

			// System.out.println(convertToBinary(n1));
			// System.out.println(convertToBinary(n2));

			String binary1 = convertToBinary(n1);
			String binary2 = convertToBinary(n2);

			int biggestLength;

			if (binary1.length() > binary2.length()) {
				biggestLength = binary1.length();
			}
			else {
				biggestLength = binary2.length();
			}

			StringBuilder binarySum = new StringBuilder();

			for (int i = 0; i < biggestLength; i++) {
				char v1 = '0';
				char v2 = '0';

				if (i < binary1.length()) {
					v1 = binary1.charAt(i);
				}

				if (i < binary2.length()) {
					v2 = binary2.charAt(i);
				}

				if ((v1 == '1' && v2 == '1') || (v1 == '0' && v2 == '0')) {
					binarySum.append('0');
				}
				else {
					binarySum.append('1');
				}
			}

			// System.out.println(power(2, 3));
			// System.out.println(binarySum.toString());
			long result = 0;

			for (int i = 0; i < binarySum.toString().length(); i++) {
				result += Integer.parseInt(binarySum.toString().substring(i, i + 1)) * power(2, i);
			}

			System.out.println(result);
		}

	}
}
