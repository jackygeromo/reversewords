package com.geromo.tutorials;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * A simple logic to reverse an input String word by word.
 * @author jgeromo
 *
 */
@SpringBootApplication
public class ReverseWordApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReverseWordApplication.class, args);
	}

	@Override
	public void run(String... strings) {
		System.out.println("START");
		String strMessage = "\"The quick brown fox jumps over the lazy dog\" is an English-language pangram—a sentence that contains all of the letters of the alphabet. It is commonly used for touch-typing practice, testing typewriters and computer keyboards, displaying examples of fonts, and other applications involving text where the use of all letters in the alphabet is desired. Owing to its brevity and coherence, it has become widely known.";
		char[] message = strMessage.toCharArray();
		System.out.println(message);

		// Reverse all the characters in the entire message
		reverseCharacters(message, 0, message.length - 1);

		// Reverse the characters in each individual word
		int currentWordStartIdx = 0;
		for (int i = 0; i <= message.length; i++) {

			// found the end of the current word or found a punctuation mark
			if (i == message.length || message[i] == ' ' || message[i] == '.' || message[i] == ','
					|| message[i] == '"') {

				// if we haven't exhausted the array, our
				// next word's start is one character ahead
				reverseCharacters(message, currentWordStartIdx, i - 1);
				currentWordStartIdx = i + 1;
			}
		}

		System.out.println(message);
		System.out.println("END");
		return;
	}

	/**
	 * Reverses the input character array from both left and right sides of the array
	 * @param message
	 * @param leftIdx
	 * @param rightIdx
	 */
	private static void reverseCharacters(char[] message, int leftIdx, int rightIdx) {
		// walk towards the middle, from both sides
		while (leftIdx < rightIdx) {

			// swap the left char and right char
			char temp = message[leftIdx];
			message[leftIdx] = message[rightIdx];
			message[rightIdx] = temp;
			leftIdx++;
			rightIdx--;
		}
	}

}
