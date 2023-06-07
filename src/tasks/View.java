package tasks;

import java.util.ArrayList;

public class View {
    public <T> void printElement(T element){
        System.out.println(element);
    }
    public <T> void printArray(ArrayList<T> inputArrayList){
        for (T element: inputArrayList) {
            System.out.println(element);
        }
    }

    public <T extends Comparable<T>> T getMax(T param1, T param2){
        if (param1.compareTo(param2) >= 0 ) return param1;
        else return param2;
    }
}
