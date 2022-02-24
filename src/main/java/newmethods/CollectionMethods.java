package newmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lambda.Person;

public class CollectionMethods {

    public static void main(String[] args) {
        Person p3 = new Person("raja", 39);
        Person p2 = new Person("kiran", 29);
        Person p1 = new Person("sasi", 19);

        List<String>  list2 = Arrays.asList("Anne","Kiran","Barbara");

        List<Person> list = new ArrayList<>(Arrays.asList(p2,p3,p1));
        list.replaceAll( p ->  new Person(p.getName().toUpperCase(), p.getAge()) );
        System.out.println("list = " + list);

        list.sort(Comparator.comparing(Person::getAge).reversed());
        System.out.println("list = " + list);

        list2.sort(Comparator.comparing(s -> s+""));
        System.out.println("list2 = " + list2);
        }
    }
