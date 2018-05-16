import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		// Creating a TreeSet without supplying any Comparator

		//MyComparator1 comparator1 = new MyComparator1();

		TreeSet set = new TreeSet(new MyComparator1());

		// Adding elements to TreeSet

		set.add(1);

		set.add(0);

		set.add(9);

		set.add(2);
		set.add(6);

		// printing elements of TreeSet

		System.out.println(set);

	}
}