package hf.ooad;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    @Getter
    private List<Mobile> mobileList = new ArrayList<>();

    protected void  addMobile(Mobile mobile) {
        mobileList.add(mobile);
    }

    protected  Mobile search (Mobile mobileSpec) {
        return Mobile.builder().build();
    }

}
