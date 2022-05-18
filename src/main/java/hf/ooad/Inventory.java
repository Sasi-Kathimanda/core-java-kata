package hf.ooad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    @Getter
    private final List<Mobile> mobiles = new ArrayList<>();
    @Getter
    @Setter
    private  List<Tv> tvs = new ArrayList<>();

    protected void addMobile(Mobile mobile) {
        mobiles.add(mobile);
    }

    protected List<Mobile> search(MobileSpec mobileSpec) {
        return mobiles.stream().filter(it-> it.getMobileSpec().matches(mobileSpec))
                      .collect(Collectors.toList());
    }
}
