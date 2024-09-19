package enunciados;

public class Palindromo {

	public static void main(String[] args) {

		String frase = "Anita lava la tina";

		String phrase = frase.trim().toLowerCase().replaceAll("[\s]", "");
		String reversePhrase = "";

		for (int i = phrase.length() - 1; i >= 0; i--) {
			reversePhrase += phrase.charAt(i);
		}

		if (phrase.equals(reversePhrase)) {
			System.out.println("Palindromo. ");

		} else {
			System.out.println("No palindrome ");

		}
	}

}
