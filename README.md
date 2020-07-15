# CSE 017 - Homework 3

You will implement a linked list data structure in this assignment. The linked list will consist of a head pointer and a tail pointer. The head pointer will point to a node struct, which will hold an integer as well as a pointer to the next node in the list. The final item in the list will be pointed to by a tail pointer. The next pointer on the tail will point to `null`.

You will implement two classes: `LinkedList` and `Node`. Create `LinkedList.java` and `Node.java` files in which you will implement these classes. Also create a `Main.java` file that will use to demonstrate your class in a `main()` function.

## LinkedList.java

Here are the methods you must implement for the LinkedList class. You may add any additional methods you deem necessary.

```Java
// fields
private Node head;
private Node tail;
private int elements.

// Constructor creates an empty list
public List();

// Insert new item at the end of list.
public void insertAtTail(item);

// Insert item at start of the list.
public void insertAtHead(int item);

// Insert item at a specified index.
public void insertAtIndex(int index, int item);

// Remove item from the end of list and return it
public Node removeTail();

// Remove item from start of list and return a it
public Node removeHead();

// Insert item at a specified index and return it
public Node removeAtIndex(int index);

// Return item at index
public int itemAtIndex(int index);

// Print the list to the console
public void toString();
```

## Node

Here are the methods you must implement for Node. You may add any additional methods you deem necessary (for instance, maybe you might find some getters and setters necessary, or some helper functions to assist with a recursive implementation).

```Java.java
private int item;
Node next;

// One arg constructor, creates a Node with an item already on it, with next pointing to `null`
public Node(int item);

```

## Examples

Write two examples demonstrating how to use the linked list class in Main.java.

## Instructions

You must make at least 1 commit per method. This means you should have a minimum of 11 commits to your repository. You can commit as many times as you like past that though.
