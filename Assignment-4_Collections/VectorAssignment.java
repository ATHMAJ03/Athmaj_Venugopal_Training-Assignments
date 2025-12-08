package Collection;

import java.util.Vector;

public class VectorAssignment {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        
        System.out.println("Vector Elements: " + vector);
        
        vector.remove("Banana");
        System.out.println("After Removing Banana: " + vector);
        
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());
    }
}
