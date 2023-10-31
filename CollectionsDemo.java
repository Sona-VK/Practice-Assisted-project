
package assistedpracticeproject;

    import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;

	public class CollectionsDemo {
	    public static void main(String[] args) {
	        // ArrayList Example
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Add elements to the ArrayList
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        arrayList.add("Date");

	        // Display elements from the ArrayList
	        System.out.println("ArrayList Elements:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        // Remove an element from the ArrayList
	        arrayList.remove("Banana");

	        // HashSet Example
	        HashSet<String> hashSet = new HashSet<>();

	        // Add elements to the HashSet
	        hashSet.add("Apple");
	        hashSet.add("Banana");
	        hashSet.add("Cherry");
	        hashSet.add("Date");

	        // Display elements from the HashSet using an Iterator
	        System.out.println("\nHashSet Elements:");
	        Iterator<String> iterator = hashSet.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Remove an element from the HashSet
	        hashSet.remove("Cherry");
	    }
	}




