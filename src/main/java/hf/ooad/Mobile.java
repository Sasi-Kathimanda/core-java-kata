package hf.ooad;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
public class Mobile {
    @EqualsAndHashCode.Exclude
    private long mobileNo;
    @EqualsAndHashCode.Exclude
    private int price;
    private Type brand;
    @EqualsAndHashCode.Exclude
    private Network network;
    @EqualsAndHashCode.Exclude
    private String modelName;
    @EqualsAndHashCode.Exclude
    private boolean simFree;
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
