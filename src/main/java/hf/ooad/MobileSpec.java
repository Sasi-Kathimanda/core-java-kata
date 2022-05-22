package hf.ooad;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class MobileSpec extends DeviceSpec {
    private Brand brand;
    private Network network;
    private String modelName;
    private boolean simFree;
    private boolean fiveGSupported;

    @Override
    public boolean matches(DeviceSpec otherSpec) {
        if (otherSpec instanceof TvSpec) return false;
        return this.getBrand().equals(((MobileSpec) otherSpec).getBrand())
                && getModelName((MobileSpec) otherSpec)
                && this.getNetwork().equals(((MobileSpec) otherSpec).getNetwork())
                && this.isSimFree() == ((MobileSpec) otherSpec).isSimFree()
                && this.isFiveGSupported() == ((MobileSpec) otherSpec).isFiveGSupported();
    }

    private boolean getModelName(MobileSpec otherSpec) {
        if (otherSpec.getModelName() == null) return true;
        return this.getModelName().equalsIgnoreCase(otherSpec.getModelName());
    }
    enum Brand {
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

}