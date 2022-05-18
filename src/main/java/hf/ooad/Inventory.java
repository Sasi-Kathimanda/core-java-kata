package hf.ooad;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    @Getter
    private final List<Mobile> mobiles = new ArrayList<>();

    protected void addMobile(Mobile mobile) {
        mobiles.add(mobile);
    }

    protected List<Mobile> search(MobileSpec mobileSpec) {
        return mobiles.stream().filter(it-> it.getMobileSpec().matches(mobileSpec))
                      .collect(Collectors.toList());
    }

    protected void addTv(Tv tv) {
    }

    protected List<Tv> getTvs() {
        return List.of();
    }
}
