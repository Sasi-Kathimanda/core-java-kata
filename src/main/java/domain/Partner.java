package domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class Partner extends Person {
    public Partner(String name, int age) {
        super(name, age);
    }
}
