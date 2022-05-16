package hf.ooad;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Tv extends Device {
    private final int modelNo;

    @Builder
    public Tv(int modelNo, int price) {
        super(price);
        this.modelNo = modelNo;
    }
}
