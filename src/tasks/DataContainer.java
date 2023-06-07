package tasks;

import java.util.*;

public class DataContainer<T extends Comparable> implements Iterable<T> {
    private ArrayList<T> dataList;

    public DataContainer() {
        dataList = new ArrayList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return new DataIterator<>(dataList);
    }

    public DataContainer add(T element) {
        dataList.add(element);
        return this;
    }

    public void remove(int index) {
        dataList.remove(index);
    }

    public T get(int index) {
        return dataList.get(index);
    }

    public void sort() {
        Collections.sort(dataList);
    }

    public void sort(Comparator comparator) {
        dataList.sort(comparator);
    }

    @Override
    public String toString() {
        return Arrays.toString(dataList.toArray());
    }

    public void printElementsSeparately() {
        for (T element : dataList) {
            System.out.println(element);
        }
    }
}
