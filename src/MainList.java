import Iterators.IteratorsDemo;
import Range_View.SublistDemo;
import positional_access_and_search.SwapDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainList {
    public static void main(String[] args) {
        var swapDemo = new SwapDemo();
        var iteratorsDemo = new IteratorsDemo();
        var sublistDemo = new SublistDemo();
        swapDemo.set();
        swapDemo.printSwap();
        swapDemo.printShuffle();
        iteratorsDemo.indexOf();
        sublistDemo.sublists();



    }

}

