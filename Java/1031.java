import java.util.Scanner;
import java.util.ArrayList;

class Main {
	public static int turnLightsDown(ArrayList<Integer> cities, int pacing) {
		int pos = 0;
		int lightedCities = cities.size();
		int lastCity = 0;

		ArrayList<Integer> copy = new ArrayList<Integer>();
		
		for (int j = 0; j < cities.size(); j++) {
			copy.add(cities.get(j));
		}

		while (lightedCities > 1) {
			copy.set(pos, -1);
			lightedCities--;

			int skipped = 0;

			while (skipped < pacing) {
				pos++;
				if (pos == cities.size()) pos = 0;
				if (copy.get(pos) != -1) skipped++;
			}
		}

		for (int i = 0; i < copy.size(); i++) {
			if (copy.get(i) != -1) lastCity = copy.get(i);
		}

		return lastCity;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		while (n != 0) {
			ArrayList<Integer> cities = new ArrayList<Integer>();

			for (int i = 0; i < n; i++) {
				cities.add(i + 1);
			}

			int pacing = 1;

			while (pacing < Integer.MAX_VALUE) {
				int lightedCity = 0;

				lightedCity = turnLightsDown(cities, pacing);

				if (lightedCity == 13) {
					System.out.println(pacing);
					break;
				}
				else {
					pacing++;
				}
			}

			n = Integer.parseInt(scanner.nextLine());
		}
	}
}
