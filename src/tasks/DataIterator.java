package tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class DataIterator<T> implements Iterator<T> {
    int index;
    ArrayList<T> dataList;

    public DataIterator(ArrayList<T> components) {
        index = 0;
        this.dataList = components;
    }

    @Override
    public boolean hasNext() {
        return index < dataList.size();
    }

    @Override
    public T next() {
        return dataList.get(index++);
    }
}
