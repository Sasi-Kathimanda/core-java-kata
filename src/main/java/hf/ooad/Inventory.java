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

    protected List<Mobile> search(Mobile mobile) {
        return mobileList.stream()
                .filter(it -> it.mobileSpec.getBrand() == mobile.mobileSpec.getBrand())
                .filter(it -> it.mobileSpec.getNetwork() == mobile.mobileSpec.getNetwork())
                .filter(it -> it.mobileSpec.getModelName().equalsIgnoreCase(mobile.mobileSpec.getModelName()))
                .filter(it -> it.mobileSpec.isSimFree() == mobile.mobileSpec.isSimFree())
                .collect(Collectors.toList());
    }

}
