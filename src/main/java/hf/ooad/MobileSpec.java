package hf.ooad;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MobileSpec {
    private Type brand;
    private Network network;
    private String modelName;
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

