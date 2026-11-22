package chapter7;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("Red");
        items.add(0, "Yellow");

        System.out.println("Display list contents with counter-controlled loop:");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }
        System.out.println();

        display(items, "Display list contents with enhanced for statement:");

        items.add("Green");
        items.add("Yellow");
        display(items, "List after adding two new elements:");

        items.remove("Yellow");
        display(items, "Remove first instance of Yellow:");

        items.remove(1);
        display(items, "Remove second list element (Green):");

        System.out.printf("\"Red\" is %sin the list\n", items.contains("Red") ? "" : "not");
        System.out.printf("Size: %d\n", items.size());
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.println(header);
        for (String item : items) {
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}
