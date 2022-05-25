package hf.ooad;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    @Getter
    private final List<Device> devices = new ArrayList<>();

    protected void addDevice(Device device) {
        devices.add(device);
    }

    protected List<Mobile> search(MobileSpec mobileSpec) {
        return devices.stream().filter(it -> it.getDeviceSpec().matches(mobileSpec))
                .map(it -> new Mobile(((Mobile) it).getMobileNo(), ((Mobile) it).getMobileSpec(), it.getPrice()))
                .collect(Collectors.toList());
    }

    protected List<Tv> search(TvSpec tvSpec) {
        return devices.stream().filter(it -> it.getDeviceSpec().matches(tvSpec))
                .map(it -> new Tv(((Tv) it).getModelNo(), it.getPrice(), ((Tv) it).getTvSpec()))
                .collect(Collectors.toList());
    }
}
