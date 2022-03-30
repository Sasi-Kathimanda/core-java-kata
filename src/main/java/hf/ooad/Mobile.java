package hf.ooad;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
public class Mobile {
    private long mobileNo;
    private int price;
    private Type brand;
    private Network network;
    private String modelName;
    private  boolean simFree;
}

enum Type {
    APPLE,
    SAMSUNG,
    ONE_PLUS,
    MICROSOFT,
    NOKIA
}

enum Network {
    SKY,
    JIO,
    O2
}
