package hf.ooad;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    @Getter
    private final List<Mobile> mobileList = new ArrayList<>();

    protected void addMobile(Mobile mobile) {
        mobileList.add(mobile);
    }

    protected List<Mobile> search(MobileSpec mobileSpec) {
        return mobileList.stream().filter(it-> it.getMobileSpec().matches(mobileSpec))
                .collect(Collectors.toList());
    }

}
