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

    protected List<Mobile> search(Mobile mobileSpec) {
        return mobileList.stream()
                .filter(it -> it.getBrand() == mobileSpec.getBrand())
                .filter(it -> it.getNetwork() == mobileSpec.getNetwork())
                .filter(it -> it.getModelName().equalsIgnoreCase(mobileSpec.getModelName()))
                .filter(it -> it.isSimFree() == mobileSpec.isSimFree())
                .collect(Collectors.toList());
    }

}
