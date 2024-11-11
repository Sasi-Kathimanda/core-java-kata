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
        return devices.stream()
                .filter(it -> it.getDeviceSpec().matches(mobileSpec))
                      .map(it -> Mobile.builder()
                                       .mobileNo(((Mobile) it).getMobileNo())
                                       .mobileSpec(((Mobile) it).getMobileSpec())
                                       .price(it.getPrice()).build())
                      .collect(Collectors.toList());
    }

    protected List<Tv> search(TvSpec tvSpec) {
        return devices.stream()
                .filter(it -> it.getDeviceSpec().matches(tvSpec))
                    .map(it -> Tv.builder()
                                   .modelNo(((Tv) it).getModelNo())
                                   .tvSpec(((Tv) it).getTvSpec())
                                   .price(it.getPrice()).build())
                      .collect(Collectors.toList());
    }
}
