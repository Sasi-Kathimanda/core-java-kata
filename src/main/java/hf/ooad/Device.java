package hf.ooad;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Device {
    @EqualsAndHashCode.Exclude
    private int price;
    private DeviceSpec deviceSpec;
}
