/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Arrays;

public class Quest {
	public static void main(String[] args) {
		String str = "In the film, Red Riding Hood and the woodcutter together kill the wolf who transmits the dark curse that resembles a virus, and the captain kills Father Solomon, who could have become another horrible wolf. Likewise, we, too, should have the courage to repudiate both the dark legacy and the madness of a tyranny that masquerades as justice. Both plagues have terrorized our society for a long time and caused us to forfeit our right to live without fear. The age of the two antagonizing monsters is over now. The future belongs to the defiant new generation that will destroy the two cursed remnants of the dark past and build a new society with a fresh new vision. “Red Riding Hood” serves as a mirror to our grim present reality and shows us how to overcome these troubled times.";


		char[] alphabet = new char[26];
		for (int i=65; i<91; i++){
			alphabet[i-65] = (char)i;
		}

		int[] count = new int[alphabet.length];
		
		int ascii = 0;
		for (int i=0; i < str.length() - 1; i++){
			ascii = (int)str.charAt(i);
			if (ascii >= 65 && ascii < 91){
				count[ascii - 65] += 1;
			}
			else if (ascii >= 97 && ascii < 123){
				count[ascii - 97] += 1;
			}
		}
		System.out.println("대소문자 구별안함.");
		for (int i=0; i<26; i++){
			System.out.printf("%c = %2d    ", alphabet[i], count[i]);
			if (i%5==4) System.out.println();
		}

	}
}
