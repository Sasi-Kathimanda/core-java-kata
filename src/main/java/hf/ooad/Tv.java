package hf.ooad;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Tv extends Device {
    private final int modelNo;
    private final TvSpec tvSpec;

    @Builder
    public Tv(int modelNo, int price, TvSpec tvSpec) {
        super(price, tvSpec);
        this.modelNo = modelNo;
        this.tvSpec = tvSpec;
    }
}
