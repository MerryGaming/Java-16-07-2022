package positional_access_and_search;

import java.util.*;

public class SwapDemo {
    public static final List<String> name = new ArrayList<String>();
    public void  set() {

        name.add("Linh");
        name.add("Bình");
        name.add("Bắc");
        name.add("Dũng");
        name.add("Phương");

    }

    public void printSwap() {
        System.out.println("Swap!!!");
        for(int i = 0; i < name.size(); i ++) {
            for(int j = i + 1; j < name.size(); j ++) {
                if(i == 2 && j == 4)
                    swap(name, i  , j );
            }
        }
        System.out.println(name);
    }

    public void printShuffle() {
        System.out.println("Shuffle!!!");
        Random rnd = new Random();
//        shuffle(name, rnd);
//        System.out.println(name);
        
        shuffle(name, rnd);
        //Collections.shuffle (name, rnd);
        Collections.shuffle (name);
        System.out.println (name);
    }

    public static <String> void swap(List<String> nameswap, int i, int j) {
        String tmp = nameswap.get(i);
        nameswap.set(i, nameswap.get(j));
        nameswap.set(j, tmp);
    }

    public static void shuffle (List <String> name, Random rnd) {
        for (int i = name.size (); i > 1; i --)
            swap (name, i - 1, rnd.nextInt (i));
    }





}
