public class Main {
  public static void main(String[] args) {

    // create linkedlist
    LinkedList list1 = new LinkedList();

    // test insert at head
    list1.insertAtHead(3); // list is now 3

    // test item at index
    System.out.println("List should be [3] (itemAtIndex test)");
    System.out.println(String.format("There are %d elements", list1.getElements()));
    System.out.println(String.format("Item at index 0: %d", list1.itemAtIndex(0)));
    System.out.println("");

    // test insert at tail
    list1.insertAtTail(6); // list is now 3, 6
    System.out.println("List should be [3 6] (insertAtTail test)");
    System.out.println(String.format("There are %d elements", list1.getElements()));
    System.out.println(String.format("Item at index 0: %d", list1.itemAtIndex(0)));
    System.out.println(String.format("Item at index 1: %d", list1.itemAtIndex(1)));
    System.out.println("");

    // test insert at index
    list1.insertAtIndex(1, 1); // list is now 3, 1, 6
    System.out.println("List should be [3 1 6] (insertAtIndex test)");
    System.out.println(String.format("There are %d elements", list1.getElements()));
    System.out.println(String.format("Item at index 0: %d", list1.itemAtIndex(0)));
    System.out.println(String.format("Item at index 1: %d", list1.itemAtIndex(1)));
    System.out.println(String.format("Item at index 2: %d", list1.itemAtIndex(2)));
    System.out.println("");

    list1. insertAtIndex(0, 2); // list is now 2, 3, 1, 6
    System.out.println("List should be [2 3 1 6] (insertAtIndex test)");
    System.out.println(String.format("There are %d elements", list1.getElements()));
    System.out.println(String.format("Item at index 0: %d", list1.itemAtIndex(0)));
    System.out.println(String.format("Item at index 1: %d", list1.itemAtIndex(1)));
    System.out.println(String.format("Item at index 2: %d", list1.itemAtIndex(2)));
    System.out.println(String.format("Item at index 3: %d", list1.itemAtIndex(3)));
    System.out.println("");

    list1.insertAtIndex(2, 5); // list is now 2, 3, 5, 1, 6
    System.out.println("List should be [2 3 5 1 6] (insertAtIndex test)");
    System.out.println(String.format("There are %d elements", list1.getElements()));
    System.out.println(String.format("Item at index 0: %d", list1.itemAtIndex(0)));
    System.out.println(String.format("Item at index 1: %d", list1.itemAtIndex(1)));
    System.out.println(String.format("Item at index 2: %d", list1.itemAtIndex(2)));
    System.out.println(String.format("Item at index 3: %d", list1.itemAtIndex(3)));
    System.out.println(String.format("Item at index 4: %d", list1.itemAtIndex(4)));
    System.out.println("");

    // test remove head
    System.out.print("Node removed was ");
    System.out.println(list1.removeHead().getItem()); // list is now 3, 5, 1, 6
    System.out.println("List should be [3 5 1 6] (removeHead test)");
    System.out.println(String.format("There are %d elements", list1.getElements()));
    System.out.println(String.format("Item at index 0: %d", list1.itemAtIndex(0)));
    System.out.println(String.format("Item at index 1: %d", list1.itemAtIndex(1)));
    System.out.println(String.format("Item at index 2: %d", list1.itemAtIndex(2)));
    System.out.println(String.format("Item at index 3: %d", list1.itemAtIndex(3)));
    System.out.println("");

    // test remove at index
    System.out.print("Node removed was ");
    System.out.println(list1.removeAtIndex(2).getItem()); // list is now 3, 5, 6
    System.out.println("List should be [3 5 6] (removeAtIndex test)");
    System.out.println(String.format("There are %d elements", list1.getElements()));
    System.out.println(String.format("Item at index 0: %d", list1.itemAtIndex(0)));
    System.out.println(String.format("Item at index 1: %d", list1.itemAtIndex(1)));
    System.out.println(String.format("Item at index 2: %d", list1.itemAtIndex(2)));
    System.out.println("");

    // test to string (to print)
    list1.print();
    System.out.println("");

    // test to string (to print)
    LinkedList list2 = new LinkedList();
    list2.print();
    System.out.println("");
  }

}