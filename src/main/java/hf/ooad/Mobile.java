package hf.ooad;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
public class Mobile extends Device {
    @EqualsAndHashCode.Exclude
    private final long mobileNo;
    private final MobileSpec mobileSpec;

    @Builder
    public Mobile(long mobileNo, MobileSpec mobileSpec, int price) {
        super(price, mobileSpec);
        this.mobileSpec = mobileSpec;
        this.mobileNo = mobileNo;
    }
}
