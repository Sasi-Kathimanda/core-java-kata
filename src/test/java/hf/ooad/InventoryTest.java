package hf.ooad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    Inventory sut;
    MobileSpec mobileSpec = MobileSpec.builder().brand(Type.SAMSUNG).network(Network.SKY).modelName("ONEPLUS").simFree(true).build();
    Mobile m1 = Mobile.builder().mobileNo(7511577533L).mobileSpec(mobileSpec).build();

    @BeforeEach
    void setUp() {
        sut = new Inventory();
    }

    @Test
    void testAddMobileToInventory() {
        MobileSpec mobileSpec = MobileSpec.builder().brand(Type.APPLE).network(Network.JIO).simFree(true).build();
        Mobile m1 = Mobile.builder().price(999).mobileNo(9440964913L).mobileSpec(mobileSpec).build();
        sut.addMobile(m1);
    }

    @Test
    void testSearchMobile() {
        initializeInventory();
        List<Mobile> searchResults = sut.search(m1);
        assertEquals(3, searchResults.size());
        assertEquals("Oneplus", searchResults.get(0).getMobileSpec().getModelName());
        assertEquals("oneplus", searchResults.get(1).getMobileSpec().getModelName());
        assertEquals("onePlus", searchResults.get(2).getMobileSpec().getModelName());
    }

    private void initializeInventory() {
        sut.addMobile(Mobile.builder().mobileNo(9440964913L).price(999).mobileSpec(MobileSpec.builder().brand(Type.APPLE).modelName("X").network(Network.JIO).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(9491279678L).price(999).mobileSpec(MobileSpec.builder().brand(Type.APPLE).modelName("11").network(Network.JIO).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(399).mobileSpec(MobileSpec.builder().brand(Type.SAMSUNG).modelName("Oneplus").network(Network.SKY).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(499).mobileSpec(MobileSpec.builder().brand(Type.SAMSUNG).modelName("oneplus").network(Network.SKY).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).price(599).mobileSpec(MobileSpec.builder().brand(Type.SAMSUNG).modelName("onePlus").network(Network.SKY).simFree(true).build()).build());
        sut.addMobile(Mobile.builder().mobileNo(7511577533L).price(999).mobileSpec(MobileSpec.builder().brand(Type.APPLE).modelName("13 Pro").network(Network.O2).simFree(true).build()).build());
    }
}