import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapExamples
{
	public static void main(String args[])
	{
		System.out.println("Show how you would use Set to find the unique elements in a List.\n");
		
		// creates an arraylist that stores: 1, 2, 3, 3 (repeated), 4
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(3); list.add(3); list.add(4);
		// creates a set that will store the unique elements from the list
		TreeSet<Integer> set = new TreeSet<Integer>(list);
		System.out.println("Original ArrayList:");
		System.out.println(list);
		System.out.println("TreeSet with only unique elements: ");
		System.out.println(set);
		
		System.out.println("\nShow an example of HashMap and a TreeMap, and explain the difference.\n");
		
		// creates a HashMap
		HashMap hash = new HashMap();
		hash.put(3, "yellow");	hash.put(2, "orange"); hash.put(1, "red"); hash.put(4, "green"); hash.put(5, "blue");
		TreeMap tree = new TreeMap();
		tree.put(3, "yellow");	tree.put(2, "orange"); tree.put(1, "red"); tree.put(4, "green"); tree.put(5, "blue");
		System.out.println("HashMap iteration order: ");
		System.out.println(hash);
		System.out.println("TreeMap in ascending order: ");
		System.out.println(tree);
		System.out.println("TreeMap in descending order: ");
		System.out.println(tree.descendingMap());
		System.out.println("A HashMap does not maintain the order of elements, but TreeMap does. However, TreeMap is slower than HashMap.");
		
		System.out.println("\nWhich should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?");
		System.out.println("You should use a TreeMap if you have to guarantee the order.");

	}
}
