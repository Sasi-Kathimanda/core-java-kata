package hf.ooad;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Comparator;
import java.util.List;

@Data
@Builder
public class MobileSpec {
    private Type brand;
    private Network network;
    private String modelName;
    private boolean simFree;
    private boolean fiveGSupported;

    public boolean matches(MobileSpec otherSpec) {
         return this.getBrand().equals(otherSpec.getBrand())
                 && this.getModelName().equalsIgnoreCase(otherSpec.getModelName())
                 && this.getNetwork().equals(otherSpec.getNetwork())
                 && this.isSimFree() == otherSpec.isSimFree()
                 && this.isFiveGSupported() == otherSpec.isFiveGSupported();
    }
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
