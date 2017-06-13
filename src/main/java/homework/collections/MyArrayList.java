package collections;

import java.util.Arrays;

public class MyArrayList {
    private int[] elements;
    private int capacity = 10;
    private int size;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
    }

    public MyArrayList() {
        this.elements = new int[capacity];
    }

    public void add(int newElement) {
        ensureSize();
        this.elements[size++] = newElement;
    }

    public void add(int newElement, int index) {
        ensureSize();
        int dest[] = new int[capacity];
        System.arraycopy(this.elements, 0, dest, 0, index);
        dest[index] = newElement;
        System.arraycopy(this.elements, index, dest, index + 1, size - index);
        size++;
        this.elements = dest;
    }

    public void removeLast() {
        elements[--size] = 0;
    }

    public void removeByIndex(int index) {
        System.arraycopy(this.elements, index + 1, this.elements, index, size - index);
        size--;
    }

    public boolean contains(int number){
        for (int element : elements) {
            if (number == element) {
                return true;
            }
        }
        return false;
    }

    public void removeObject(Integer integer){
        for (int i = 0; i < size; i++) {
            if(elements[i] == integer){
                removeByIndex(i);
            }
        }
    }

    public void addAll(int [] array){
        for (int i:array) {
            add(i, size);
        }
    }

    public void set(int index, int value){
        try {
            elements[index] = value;
        } catch (ArrayIndexOutOfBoundsException e1) {

        }
    }

    private void ensureSize() {
        if (size + 1 > capacity) {
            int newCapacity = (this.capacity * 3) / 2 + 1;
            int[] dest = new int[newCapacity];
            System.arraycopy(this.elements, 0, dest, 0, this.size);
            this.elements = dest;
            this.capacity = newCapacity;
        }
    }

    @Override
    public String toString() {
        String temp = "[";
        for (int i = 0; i < size; i++) {
            if (i == size - 1){
                temp = temp.concat(elements[i] + "]");
                break;
            }
            temp = temp.concat(elements[i] + ", ");
        }
//        return "MyArrayList{" +
//                "elements=" + temp +
//                ", capacity=" + capacity +
//                ", size=" + size +
//                '}';
        return temp;
    }

}
