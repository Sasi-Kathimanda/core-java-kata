package hf.ooad;

import lombok.Builder;

@Builder
public class TvSpec extends DeviceSpec {
    private final ScreenSize screenSize;
    private final Resolution resolution;

    public TvSpec(ScreenSize screenSize, Resolution resolution) {
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

     enum ScreenSize {
        FORTY_THREE_INCH(43),
        FIFTY_FIVE_INCH(55),
        SIXTY_FIVE_INCH(65),
        SEVENTY_FIVE_INCH(75);
        private int size;
        ScreenSize(int size) {
            this.size = size;
        }
    }

     enum Resolution {
        FULL_HD,
        ULTRA_HD,
        FOUR_K,
        EIGHT_K
    }
}
