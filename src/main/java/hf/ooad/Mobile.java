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
    MobileSpec mobileSpec;
}
