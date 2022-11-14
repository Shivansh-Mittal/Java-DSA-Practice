package javaCore;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPractice {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(7);
        col.add(9);
        System.out.println(col);
        Iterator it = col.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
