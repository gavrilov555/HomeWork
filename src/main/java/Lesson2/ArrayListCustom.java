package Lesson2;

class ArrayListCustom<T> {

    private T[] list;
    private int size;
    private final int CAPACITY = 5;


    public ArrayListCustom(int capacity) {
        if(capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0 ");
        }else {
            list = (T[]) new Object[capacity];
        }
    }

    public ArrayListCustom() {
        list = (T[]) new Object[CAPACITY];
    }

    public void add(T item) {
        list[size++] = item;
    }



}
