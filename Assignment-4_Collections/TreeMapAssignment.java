package Collection;

import java.util.*;

public class TreeMapAssignment {
	
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        
        tmap.put(3, "Apple");
        tmap.put(1, "Banana");
        tmap.put(2, "Cherry");
        
        System.out.println("Ascending Order:");
        for (Map.Entry<Integer, String> entry : tmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        System.out.println("\nDescending Order:");
        NavigableMap<Integer, String> desc = tmap.descendingMap();
        for (Map.Entry<Integer, String> entry : desc.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
