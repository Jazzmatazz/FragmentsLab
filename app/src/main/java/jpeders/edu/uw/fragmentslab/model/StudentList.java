package jpeders.edu.uw.fragmentslab.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class StudentList {

    /**
     * An array of sample (dummy) items.
     */
    public static List<Student> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<Integer, Student> ITEM_MAP = new HashMap<>();

    static {
        // Add 3 sample items.
        addItem(new Student(1, "John Doe", "CSS"));
        addItem(new Student(2, "Jane Doe", "CES"));
        addItem(new Student(3, "Joe Doe", "CSS"));
    }

    private static void addItem(Student item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

}
