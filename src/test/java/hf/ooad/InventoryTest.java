package hf.ooad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    Inventory sut;
    MobileSpec mobileSpec = MobileSpec.builder().brand(MobileSpec.Brand.SAMSUNG).network(MobileSpec.Network.SKY).modelName("ONEPLUS").simFree(true).build();

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
    void testSearchMobile() {
        initializeInventory();
        List<Mobile> searchResults = sut.search(mobileSpec);
        assertEquals(2, searchResults.size());
        assertEquals("Oneplus", searchResults.get(0).getMobileSpec().getModelName());
        assertEquals("oneplus", searchResults.get(1).getMobileSpec().getModelName());
    }

    private void initializeInventory() {
        sut.addMobile(Mobile.builder().mobileNo(9440964913L).price(999).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.APPLE).modelName("X").network(MobileSpec.Network.JIO).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(9491279678L).price(999).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.APPLE).modelName("11").network(MobileSpec.Network.JIO).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(399).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.SAMSUNG).modelName("Oneplus").network(MobileSpec.Network.SKY).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(499).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.SAMSUNG).modelName("oneplus").network(MobileSpec.Network.SKY).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(599).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.SAMSUNG).modelName("onePlus").network(MobileSpec.Network.SKY).simFree(true).fiveGSupported(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(7511577533L).price(999).mobileSpec(MobileSpec.builder().brand(MobileSpec.Brand.APPLE).modelName("13 Pro").network(MobileSpec.Network.O2).simFree(true).fiveGSupported(true).build()).build());
    }
}