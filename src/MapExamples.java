import java.util.ArrayList;
import java.util.TreeSet;

public class MapExamples
{
	public static void main(String args[])
	{
		// Show how you would use Set to find the unique elements in a List.
		
		// creates an arraylist that stores: 1, 2, 3, 3 (repeated), 4
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(3); list.add(3); list.add(4);
		// creates a set that will store the unique elements from the list
		TreeSet<Integer> set = new TreeSet<Integer>(list);
		System.out.println("Original ArrayList:");
		System.out.println(list);
		System.out.println("TreeSet with only unique elements: ");
		System.out.println(set);
	}
	
}
