package generics.world;

import domain.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyUsageRawType {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sasi");
        list.add(new Person("kiran",2));
        list.add(1);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
