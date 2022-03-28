package hf.ooad;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    @Getter
    private List<Mobile> mobileList = new ArrayList<>();

    protected void  addMobile(Mobile mobile) {
        mobileList.add(mobile);
    }

    protected  Mobile search (Mobile mobileSpec) {
        return mobileList.stream().filter( it -> it.equals(mobileSpec)).findAny().orElse(Mobile.builder().build());
    }

}
