package leetcode;

public class GoatLatin {
	public static String toGoatLatin(String S) {
		String words[] = S.split(" ");

		for (int i = 0; i < words.length; i++) {
			String temp = words[i];
			if (!temp.startsWith("a") && !temp.startsWith("e") && !temp.startsWith("i") && !temp.startsWith("o") && !temp.startsWith("u") &&
				!temp.startsWith("A") && !temp.startsWith("E") && !temp.startsWith("I") && !temp.startsWith("O") && !temp.startsWith("U")) {
				char c= temp.charAt(0);
				temp = temp.substring(1, words[i].length()) + c;
			}

			temp  = temp + "ma";
			for (int j = 0; j < i + 1; j++) {
				temp = temp + "a";
			}
			words[i] = temp;
		}

		return String.join(" ", words);
	}

	public static void main(String[] args) {
		System.out.println(toGoatLatin("I speak Goat Latin"));
	}
}
