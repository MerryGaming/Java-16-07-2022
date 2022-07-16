package Iterators;

import positional_access_and_search.SwapDemo;

import java.util.ListIterator;

public class IteratorsDemo extends SwapDemo {
    public void indexOf () {
        ListIterator<String> iterator = name.listIterator();

        System.out.println("Hiển thị list xuôi:");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.set("Khoa");
        iterator.add("Hồng");
        System.out.println("List  sau khi update: " + name);

        System.out.println("Hiển thị list ngược:");
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
