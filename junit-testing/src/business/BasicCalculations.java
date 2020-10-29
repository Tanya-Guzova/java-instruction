package business;


public class BasicCalculations {
	
	public int square(int nbr) {
		int square = nbr * nbr;
		return square;
	}
	
	public int countA(String str) {
		int count = 0;
		char [] characters = str.toCharArray();
		for (char ch: characters) {
			if (ch == 'a' || ch == 'A') {
				count++;
			}
		}
		return count;
	}
}
