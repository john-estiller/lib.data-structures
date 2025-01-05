import java.util.ArrayList;
import java.util.List;

public class ArrayImplementation {

    public static void main(String[] args) {
        /* STATIC IMPLEMENTATION */
        // Initialize an array with mixed data types (using Object)
        Object[] myArray = new Object[6]; 
        myArray[0] = 42;
        myArray[1] = "Java";
        myArray[2] = true;
        myArray[3] = new Person("Bob"); 
        myArray[4] = null;

        // Modify an existing element
        myArray[1] = "Groovy"; 

        // Accessing elements (including null)
        System.out.println(myArray[0]); // Output: 42
        System.out.println(myArray[4]); // Output: null

        // Limitations of arrays in Java
        // - No dynamic resizing:  myArray.length remains fixed at 6
        // - Adding or removing elements requires creating a new array and copying elements

        System.out.println(myArray); 
        // Expected Output: [42, Groovy, true, Person{name='Bob'}, null, null] 
        
        /* DYNAMIC IMPLEMENTATION */
        // Initialize a list with mixed data types
        List<Object> myList = new ArrayList<>();
        myList.add(10);
        myList.add("hello");
        myList.add(true);
        myList.add(new Person("Alice")); // Custom object
        myList.add(null); 

        // Modify an element
        myList.set(1, "world");

        // Add elements (dynamic resizing)
        myList.add(3.14);
        myList.add(0, "start"); // Insert at the beginning

        // Remove elements
        myList.remove(myList.size() - 1); // Remove the last element
        myList.remove(0); // Remove the first element

        // Accessing elements
        System.out.println(myList.get(0)); // Output: world
        System.out.println(myList.get(3)); // Output: null

        // Demonstrate dynamic resizing
        for (int i = 0; i < 5; i++) {
            myList.add(i * 5);
        }

        System.out.println(myList); 
        // Output: [10, world, true, Person{name='Alice'}, null, 0, 5, 10, 15, 20]
    }

    // Example custom class
    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}