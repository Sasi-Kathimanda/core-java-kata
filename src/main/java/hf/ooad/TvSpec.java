package hf.ooad;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class TvSpec extends DeviceSpec {
    private final ScreenSize screenSize;
    private final Resolution resolution;

    public TvSpec(ScreenSize screenSize, Resolution resolution) {
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    @Override
    public boolean matches(DeviceSpec otherTvSpec) {
        if (!(otherTvSpec instanceof TvSpec)) return false;
        if (!super.matches(otherTvSpec)) return false;
        return this.getResolution().equals(((TvSpec) otherTvSpec).getResolution())
                && ((TvSpec) otherTvSpec).getScreenSize() == null
                || this.getScreenSize().equals(((TvSpec) otherTvSpec).getScreenSize());
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

