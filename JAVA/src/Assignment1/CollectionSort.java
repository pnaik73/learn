package Assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Bat");
		a.add("Ball");
		a.add("cricket");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}
}
