package hf.ooad;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Tv extends Device {
    private final String modelName;

    @Builder
    public Tv(String modelName, int price) {
        super(price);
        this.modelName = modelName;
    }
}
