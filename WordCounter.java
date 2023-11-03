package WordCounter;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Word Counting Game!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Text: ");
		String str=sc.nextLine().trim();
		int count=0;
		String arr[]= str.split("\\s+|\\p{Punct}");
		for(String a:arr) {
			 count++;
		}
		System.out.println("The total number of words in your text are: "+count);
		sc.close();
	}
	
}
