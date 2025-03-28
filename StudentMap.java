import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMap {

    public static void addStudents(Map<Integer, String> map, Scanner obj, int limit) {
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter the rollno: ");
            int rno = obj.nextInt();
            obj.nextLine();  
            System.out.print("Enter the Name to insert: ");
            String data = obj.nextLine();
            map.put(rno, data);
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        Map<Integer, String> stD = new HashMap<>();

        System.out.print("Enter the number of students: ");
        int limit = obj.nextInt();
        addStudents(stD, obj, limit);

        System.out.println("The elements in HashMap are: " + stD);

        System.out.print("Enter the roll no to get the details: ");
        int getr = obj.nextInt();
        System.out.println("The name of roll number " + getr + " is: " + stD.get(getr));

        System.out.print("Enter the key to search: ");
        int key = obj.nextInt();
        System.out.println("Key " + key + " present? " + stD.containsKey(key));

        obj.nextLine();  
        System.out.print("Enter the value to search: ");
        String value = obj.nextLine();
        System.out.println("Value '" + value + "' present? " + stD.containsValue(value));

        System.out.println("Entries in the map:");
        for (Map.Entry<Integer, String> entry : stD.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("HashMap empty? " + stD.isEmpty());
        System.out.println("Keys: " + stD.keySet());
        System.out.println("Values: " + stD.values());

        System.out.print("Enter the key to remove: ");
        int remove = obj.nextInt();
        stD.remove(remove);
        System.out.println("HashMap after removing key " + remove + ": " + stD);

        System.out.print("Enter the number of students in second map: ");
        int limit2 = obj.nextInt();

        Map<Integer, String> stD2 = new HashMap<>();
        addStudents(stD2, obj, limit2);

        System.out.println("The elements in the new HashMap are: " + stD2);

        stD.putAll(stD2);
        System.out.println("Combined HashMap: " + stD);

        stD.clear();
        System.out.println("Cleared HashMap");
    }
}