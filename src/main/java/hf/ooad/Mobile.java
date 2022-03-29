package hf.ooad;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mobile {
    private long mobileNo;
    private int price;
    private Type brand;
    private String network;
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
