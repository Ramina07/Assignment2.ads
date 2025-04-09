// Basic implementation of MyList using dynamic array
public class MyArrayList<T> implements MyList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[10]; // default initial size
        size = 0;
    }

    // Adds an item to the end
    public void add(T item) {
        ensureCapacity();
        data[size++] = item;
    }

    // Retrieves item at given index
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    // Removes element at index
    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public int size() {
        return size;
    }

    // To be implemented
    public void set(int index, T item) {}
    public void add(int index, T item) {}
    public void addFirst(T item) {}
    public void addLast(T item) {}
    public T getFirst() { return null; }
    public T getLast() { return null; }
    public void removeFirst() {}
    public void removeLast() {}
    public void sort() {}
    public int indexOf(Object object) { return -1; }
    public int lastIndexOf(Object object) { return -1; }
    public boolean exists(Object object) { return false; }
    public Object[] toArray() { return null; }
    public void clear() {}
    public java.util.Iterator<T> iterator() { return null; }
}
