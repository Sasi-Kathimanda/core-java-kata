package hf.ooad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    Inventory sut;
    Mobile m1 = Mobile.builder().mobileNo(7511577533L).brand(Type.SAMSUNG).network(Network.SKY).modelName("ONEPLUS").simFree(true).build();

    @BeforeEach
    void setUp() {
        sut = new Inventory();
    }

    @Test
    void testAddMobileToInventory() {
        Mobile m1 = Mobile.builder().mobileNo(9440964913L).brand(Type.APPLE).network(Network.JIO).price(999).simFree(true).build();
        sut.addMobile(m1);
    }

    @Test
    void testSearchMobile() {
        initializeInventory();
        List<Mobile> searchResults = sut.search(m1);
        assertEquals(3, searchResults.size());
        assertEquals("Oneplus", searchResults.get(0).getModelName());
        assertEquals("oneplus", searchResults.get(1).getModelName());
        assertEquals("onePlus", searchResults.get(2).getModelName());
    }

    private void initializeInventory() {
        sut.addMobile(Mobile.builder().mobileNo(9440964913L).brand(Type.APPLE).modelName("X").network(Network.JIO).price(999).simFree(true).build());
        sut.addMobile(Mobile.builder().mobileNo(9491279678L).brand(Type.APPLE).modelName("11").network(Network.JIO).price(999).simFree(true).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).brand(Type.SAMSUNG).modelName("Oneplus").network(Network.SKY).price(399).simFree(true).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).brand(Type.SAMSUNG).modelName("oneplus").network(Network.SKY).price(499).simFree(true).build());
        sut.addMobile(Mobile.builder().mobileNo(74405195886L).brand(Type.SAMSUNG).modelName("onePlus").network(Network.SKY).price(599).simFree(true).build());
        sut.addMobile(Mobile.builder().mobileNo(7511577533L).brand(Type.APPLE).modelName("13 Pro").network(Network.O2).price(999).simFree(true).build());
    }
}