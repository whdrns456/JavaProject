package ch14;

import java.util.Arrays;

public class Box<T> {

    private T[] list;
    private int size;

    public  Box(){}

    public T[] getList() {
        return list;
    }

    public void setList(T[] list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }
}
