  
public class Node {
    private int item;
    Node next;

    // One arg constructor, creates a Node with an item already on it, with next pointing to `null`
    public Node(int item) {
        this.item = item;
    }

    public int getItem() {
      return this.item;
    }

    // wrapper itemAtIndex
    public int itemAtIndex(int ix, int curr_ix, Node curr_node) {
        if (curr_node == null) {
            throw new RuntimeException("List is too short.");
        } else if (ix == curr_ix) {
            return curr_node.item;
        } else {
            curr_node = curr_node.next;
            curr_ix += 1;
            return this.itemAtIndex(ix, curr_ix, curr_node);
        }
    }

    // wrapper insertAtIndex
    public void insertAtIndex(int ix, int item, int curr_ix, Node curr_node, LinkedList list) {
        if (ix == 0) {
            list.insertAtHead(item);
        } else if (curr_node == null) {
            throw new RuntimeException("List is too short.");
        } else if (ix-1 == curr_ix) {
            Node nn = new Node (item);
            Node prev = curr_node;
            nn.next = prev.next;
            prev.next = nn;
            list.setElements(list.getElements() + 1);
        } else {
            curr_node = curr_node.next;
            curr_ix += 1;
            this.insertAtIndex(ix, item, curr_ix, curr_node, list);
        }
    }

    // wrapper removeTail
    public Node removeTail(int curr_ix, Node curr_node, LinkedList list) {
        if (list.getElements() == 0) {
            throw new RuntimeException("List is empty.");
        } else if (list.getElements() == 1) {
            return list.removeHead();
        } else if (curr_ix == list.getElements()-2) {
            Node prev = curr_node;
            Node return_node = prev.next;
            prev.next = null;
            list.setTail(prev);
            list.setElements(list.getElements() - 1);
            return return_node;
        } else {
            curr_ix += 1;
            curr_node = curr_node.next;
            return this.removeTail(curr_ix, curr_node, list);
        }
    }

    // wrapper removeAtIndex
    public Node removeAtIndex(int ix, int curr_ix, Node curr_node, LinkedList list) {
        if (ix == 0) {
            return list.removeHead();
        } else if (curr_node == null) {
            throw new RuntimeException("List is too short.");
        } else if (ix-1 == curr_ix) {
            Node prev = curr_node;
            Node next = prev.next;
            prev.next = next.next;
            list.setElements(list.getElements() - 1);
            return next;
        } else {
            curr_node = curr_node.next;
            curr_ix += 1;
            return this.removeAtIndex(ix, curr_ix, curr_node, list);
        }
    }

    // wrapper toString/toPrint
    public void print(LinkedList list) {
        if (list.getElements() == 1) {
            System.out.println(Integer.toString(list.getHead().item));
        } else {
            System.out.print(String.format("%s ", Integer.toString(list.getHead().item)));
            list.removeHead();
            this.print(list);
        }
    }
    
}