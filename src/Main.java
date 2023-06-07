import tasks.DataContainer;
import tasks.impl.Mage;
import tasks.View;
import tasks.impl.Warrior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //TASK 1
        View view = new View();
        System.out.println("TASK1. I can print any type of objects: ");
        view.printElement("default string");
        view.printElement(12133);
        view.printElement(2244.2424);
        view.printElement(new Mage("Merlin", 5000, 2500, 10));

        System.out.println();

        //TASK2
        System.out.println("TASK2. I can print any type of arrays: ");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(111);
        nums.add(222);
        nums.add(333);
        view.printArray(nums);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("first string");
        strings.add("second string");
        strings.add("third string");
        view.printArray(strings);

        ArrayList<Mage> mages = new ArrayList<>();
        mages.add(new Mage("Mage 1", 100, 100, 1));
        mages.add(new Mage("Mage 2", 200, 200, 6));
        mages.add(new Mage("Mage 3", 300, 300, 9));
        view.printArray(mages);

        System.out.println();

        //TASK3
        System.out.println("TASK3. I can compare any comparable types and return max value of them: ");
        System.out.println(view.getMax(10, 11));
        System.out.println(view.getMax(45.45, 25.20));
        System.out.println(view.getMax("Stroke1", "Stroke2"));
        System.out.println(view.getMax(new Mage("Mage 1", 50, 50, 1),
                new Mage("Mage 2", 70, 70, 2)));

        System.out.println();

        //TASK4
        System.out.println("TASK4. I can store any types of comparable elements: add, remove, get and sort them all");
        DataContainer<Warrior> warriors = new DataContainer<>();
        System.out.println("Список воинов: ");
        warriors.
                add(new Warrior("Warrior 1", 50, 110, 1)).
                add(new Warrior("Warrior 2", 110, 50, 4)).
                add(new Warrior("Warrior 3", 70, 70, 2)).
                add(new Warrior("Warrior 4", 90, 90, 3));
        warriors.printElementsSeparately();
        warriors.remove(0);
        System.out.println("Удалили одного воина: ");
        warriors.printElementsSeparately();
        System.out.println("Смотрим на 3-го воина: ");
        System.out.println(warriors.get(2));
        warriors.sort();
        System.out.println("Список отсортированных воинов (по уровню): ");
        warriors.printElementsSeparately();
        warriors.sort(Collections.reverseOrder());
        System.out.println("Список отсортированных в обратном порядке (по уровню) воинов: ");
        warriors.printElementsSeparately();
        warriors.sort(Comparator.comparingInt(Warrior::getStamina));
//        warriors.sort((war1, war2)-> Integer.compare(war1.getStamina(), war2.getStamina()));
        System.out.println("Список отсортированных воинов (по выносливости)");
        warriors.printElementsSeparately();
    }
}