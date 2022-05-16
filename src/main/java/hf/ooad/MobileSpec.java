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
    private boolean fiveGSupported;

    public boolean matches(MobileSpec otherSpec) {
        return this.getBrand().equals(otherSpec.getBrand())
                && getModelName(otherSpec)
                && this.getNetwork().equals(otherSpec.getNetwork())
                && this.isSimFree() == otherSpec.isSimFree()
                && this.isFiveGSupported() == otherSpec.isFiveGSupported();
    }

    private boolean getModelName(MobileSpec otherSpec) {
        if (otherSpec.getModelName() == null) return true;
        return this.getModelName().equalsIgnoreCase(otherSpec.getModelName());
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
