

import java.util.ArrayList;

class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("ONE");

		list1.add("TWO");

		list1.add("THREE");

		list1.add("FOUR");

		System.out.println(list1); // Output : [ONE, TWO, THREE, FOUR]

		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("THREE");

		list2.add("FOUR");

		list2.add("FIVE");

		list2.add("SIX");

		System.out.println(list2); // Output : [THREE, FOUR, FIVE, SIX]

		// list1.removeAll(list2); //Removes the elements of list1 which are
		// also elements of list2

		System.out.println(list1.retainAll(list2));
		System.out.println(list1);// Output : [ONE, TWO]

		// list1.addAll(2, list2); //Inserts all elements of list2 into list1 at
		// position 2

		// System.out.println(list1); //Output : [ONE, TWO, THREE, FOUR, FIVE,
		// SIX]

		// list1.retainAll(list2); // Retains all elements of list1 which are
		// also
		// elements of list2

		// System.out.println(list1.retainAll(list2)); // Output : [THREE, FOUR,
		// FIVE, SIX]

	}
}