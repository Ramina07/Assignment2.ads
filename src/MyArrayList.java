// Custom implementation of a doubly linked list
public class MyLinkedList<T> implements MyList<T> {

    // Inner node class
    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Adds to the end
    @Override
    public void add(T item) {
        Node newNode = new Node(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Returns item at given index
    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    // Removes item at index
    @Override
    public void remove(int index) {
        Node node = getNode(index);
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }

        size--;
    }

    // Returns current size
    @Override
    public int size() {
        return size;
    }

    // Helper to access node by index
    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }

    // ========== NOT IMPLEMENTED YET ==========

    @Override
    public void set(int index, T item) {
        // to be implemented later
    }

    @Override
    public void add(int index, T item) {
        // to be implemented later
    }

    @Override
    public void addFirst(T item) {
        // to be implemented later
    }

    @Override
    public void addLast(T item) {
        // to be implemented later
    }

    @Override
    public T getFirst() {
        return null; // to be implemented later
    }

    @Override
    public T getLast() {
        return null; // to be implemented later
    }

    @Override
    public void removeFirst() {
        // to be implemented later
    }

    @Override
    public void removeLast() {
        // to be implemented later
    }

    @Override
    public void sort() {
        // to be implemented later
    }

    @Override
    public int indexOf(Object object) {
        return -1; // to be implemented later
    }

    @Override
    public int lastIndexOf(Object object) {
        return -1; // to be implemented later
    }

    @Override
    public boolean exists(Object object) {
        return false; // to be implemented later
    }

    @Override
    public Object[] toArray() {
        return null; // to be implemented later
    }

    @Override
    public void clear() {
        // to be implemented later
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return null; // to be implemented later
    }
}
