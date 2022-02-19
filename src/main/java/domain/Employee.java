package domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class Employee extends Person {
    public Employee(String name, int age) {
        super(name, age);
    }
}
