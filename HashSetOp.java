import java.util.*;

public class HashsetOp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        HashSet<String> hashs = new HashSet<>();
        String data;
        int limit, i;

        // Input number of elements to be added to HashSet
        System.out.print("Enter the number of elements to be added to the HashSet: ");
        limit = obj.nextInt();
        obj.nextLine();  // Consume the leftover newline character
        
        for (i = 0; i < limit; i++) {
            System.out.print("Enter the data to be inserted in the HashSet: ");
            data = obj.nextLine();  // Use nextLine() to handle multi-word input properly
            hashs.add(data);
        }

        // Display HashSet
        System.out.println("The data in HashSet are: " + hashs);
        System.out.println("The Size of HashSet is: " + hashs.size());

        // Search for an element in the HashSet
        String search;
        System.out.print("Enter the data to search: ");
        search = obj.nextLine();
        System.out.println("Whether the entered data '" + search + "' is present or not (true/false)? " + hashs.contains(search));

        // Check if HashSet is empty
        System.out.println("Is HashSet empty? " + hashs.isEmpty());

        // Creating a second HashSet and adding elements
        HashSet<String> hashs2 = new HashSet<>();
        String d2;
        int l2;
        System.out.print("Enter the number of elements to be added to the new HashSet: ");
        l2 = obj.nextInt();
        obj.nextLine();  // Consume the leftover newline character
        
        for (i = 0; i < l2; i++) {
            System.out.print("Enter the data to be inserted in the new HashSet: ");
            d2 = obj.nextLine();  // Read each data entry as a whole line
            hashs2.add(d2);
        }

        // Adding all elements from second HashSet to the first
        hashs.addAll(hashs2);
        System.out.println("Displaying HashSet after adding elements from another HashSet: " + hashs);

        // Iterating through the HashSet using Iterator
        Iterator<String> itr = hashs.iterator();
        while (itr.hasNext()) {
            System.out.println("The Element in HashSet: " + itr.next());
        }

        // Checking if all elements from second HashSet are present in the first HashSet
        System.out.println("Whether all data are present in HashSet (true/false)? " + hashs.containsAll(hashs2));

        // Checking if both HashSets are equal
        System.out.println("Whether both HashSets are equal (true/false)? " + hashs.equals(hashs2));

        // Getting the hash code of the HashSet
        int hashcode = hashs.hashCode();
        System.out.println("The HashCode of the HashSet is: " + hashcode);

        // Removing an element from the HashSet
        String remove;
        System.out.print("Enter the data to remove from HashSet: ");
        remove = obj.nextLine();
        hashs.remove(remove);
        System.out.println("The HashSet after removal: " + hashs);

        // Converting HashSet to ArrayList
        ArrayList<String> hashlist = new ArrayList<>(hashs);
        System.out.println("The elements in HashSet after converting to list: " + hashlist);

        // Retaining common elements between the two HashSets
        hashs.retainAll(hashs2);
        System.out.println("The HashSet after retaining common elements: " + hashs);

        // Clearing all elements from the HashSet
        hashs.clear();
        System.out.println("The HashSet after removal of all elements: " + hashs);
    }
}
