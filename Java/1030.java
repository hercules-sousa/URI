import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nc, n, k;
		nc = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < nc; i++) {
			String[] entry = scanner.nextLine().split(" ");
			n = Integer.parseInt(entry[0]);
			k = Integer.parseInt(entry[1]);

			int[] people = new int[n];

			for (int j = 0; j < n; j++) {
				people[j] = j + 1;
			}

			int pos = 0;
			int peopleAlive = n;
	
			while (peopleAlive > 1) {
				int skipped = 1;

				while (skipped < k) {
					if (pos == n - 1) pos = 0;
					else pos++;

					if (people[pos] != -1) { 
						skipped++; 
					}
				}

				people[pos] = -1;
				peopleAlive--;

				while (people[pos] == -1) {
					if (pos == n - 1) pos = 0;
					else pos++;
				}
			}

			for (int a = 0; a < n; a++) {
				if (people[a] != -1) {
					System.out.printf("Case %d: %d\n", i + 1, people[a]);
					break;
				}
			}
		}
	}
}
