package hf.ooad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    Inventory sut;
    Mobile m1 = Mobile.builder().mobileNo(7511577533L).brand("Apple").modelName("13 Pro").network("o2").price(999).simFree(true).build();

    @BeforeEach
    void setUp() {
        sut = new Inventory();
    }

    @Test
    void testAddMobileToInventory() {
        Mobile m1 = Mobile.builder().mobileNo(9440964913L).brand("Apple").network("Jio").price(999).simFree(true).build();
        sut.addMobile(m1);
        assertEquals("Apple", sut.getMobileList().get(0).getBrand());
    }

    @Test
    void testSearchMobile() {
        initializeInventory(sut);
        Mobile searchResults = sut.search(m1);
        assertEquals(m1, searchResults);

    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addMobile(Mobile.builder().mobileNo(9440964913L).brand("Apple").modelName("X").network("Jio").price(999).simFree(true).build());
        inventory.addMobile(Mobile.builder().mobileNo(9491279678L).brand("Apple").modelName("11").network("Jio").price(999).simFree(true).build());
        inventory.addMobile(Mobile.builder().mobileNo(74405195886L).brand("Samsung").modelName("Oneplus").network("Sky").price(399).simFree(true).build());
        inventory.addMobile(Mobile.builder().mobileNo(7511577533L).brand("Apple").modelName("13 Pro").network("o2").price(999).simFree(true).build());
    }
}