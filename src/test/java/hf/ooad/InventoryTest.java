package hf.ooad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    Inventory sut;
    MobileSpec mobileSpec = MobileSpec.builder().brand(MobileSpec.Brand.SAMSUNG).network(MobileSpec.Network.SKY).modelName("ONEPLUS").simFree(true).build();
    TvSpec tvSpec = TvSpec.builder().resolution(TvSpec.Resolution.FOUR_K).build();

    @BeforeEach
    void setUp() {
        sut = new Inventory();
    }

    @Test
    void testAddMobileToInventory() {
        MobileSpec mobileSpec = MobileSpec.builder().brand(MobileSpec.Brand.APPLE).network(MobileSpec.Network.JIO).simFree(true).build();
        Mobile m1 = Mobile.builder().price(999).mobileNo(9440964913L).mobileSpec(mobileSpec).build();
        sut.addMobile(m1);
        assertEquals(1, sut.search(mobileSpec).size());
        assertEquals(9440964913L, sut.search(mobileSpec).get(0).getMobileNo());
    }

    @Test
    void givenTv_WhenAddTvToInventory_ShouldAddTvs() {
        //Given
        TvSpec tvSpec = TvSpec.builder().screenSize(TvSpec.ScreenSize.FORTY_THREE_INCH).resolution(TvSpec.Resolution.FOUR_K).build();
        Tv tv = Tv.builder().modelNo(1).price(1600).tvSpec(tvSpec).build();

        //When
        sut.setTvs(List.of(tv));

        //Then
        assertEquals(1, sut.getTvs().size());

    }

    @Test
    void testSearchMobile() {
        initializeInventory();
        List<Mobile> searchResults = sut.search(mobileSpec);
        assertEquals(2, searchResults.size());
        assertEquals("Oneplus", searchResults.get(0).getMobileSpec().getModelName());
        assertEquals("oneplus", searchResults.get(1).getMobileSpec().getModelName());
    }

    @Test
    void testSearchTv() {
        initializeInventory();
        List<Tv> searchResults = sut.search(tvSpec);
        assertEquals(2, searchResults.size());
        assertEquals("FOUR_K", searchResults.get(0).getTvSpec().getResolution().name());
        assertEquals("FOUR_K", searchResults.get(1).getTvSpec().getResolution().name());
    }

    private void initializeInventory() {
        sut.addMobile(Mobile.builder().mobileNo(9440964913L).price(999).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.APPLE).modelName("X").network(MobileSpec.Network.JIO).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(9491279678L).price(999).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.APPLE).modelName("11").network(MobileSpec.Network.JIO).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(399).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.SAMSUNG).modelName("Oneplus").network(MobileSpec.Network.SKY).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(499).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.SAMSUNG).modelName("oneplus").network(MobileSpec.Network.SKY).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(599).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.SAMSUNG).modelName("onePlus").network(MobileSpec.Network.SKY).simFree(true).fiveGSupported(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(7511577533L).price(999).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.APPLE).modelName("13 Pro").network(MobileSpec.Network.O2).simFree(true).fiveGSupported(true).build()).build());

        sut.setTvs(List.of(
                Tv.builder().modelNo(1).tvSpec(TvSpec.builder().resolution(TvSpec.Resolution.FOUR_K).screenSize(TvSpec.ScreenSize.SIXTY_FIVE_INCH).build()).build(),
                Tv.builder().modelNo(2).tvSpec(TvSpec.builder().resolution(TvSpec.Resolution.FOUR_K).screenSize(TvSpec.ScreenSize.SIXTY_FIVE_INCH).build()).build()
        ));
    }
}