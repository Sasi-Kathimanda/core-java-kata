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

    protected List<Device> search(MobileSpec mobileSpec) {
        return devices.stream().filter(it -> it.getDeviceSpec().matches(mobileSpec))
                .collect(Collectors.toList());
    }

    protected List<Device> search(TvSpec tvSpec) {
        return devices.stream().filter(it -> it.getDeviceSpec().matches(tvSpec))
                .collect(Collectors.toList());
    }
}
