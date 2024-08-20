package Assignment1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String text = s.nextLine();
		char[] ch=text.toCharArray();
		Set<Character> duplicate= new LinkedHashSet<Character>();
		for (int i = 0; i <= ch.length-1; i++) {
			duplicate.add(ch[i]);
		}
		Iterator<Character> i= duplicate.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
	}
}
