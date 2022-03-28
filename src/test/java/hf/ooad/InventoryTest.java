package hf.ooad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testAddMobileToInventory() {
        Inventory inventory = new Inventory();
        Mobile m1 = Mobile.builder().mobileNo(9440964913L).brand("Apple").network("Jio").price(999).simFree(true).build();
        inventory.addMobile(m1);
        assertEquals("Apple",inventory.getMobileList().get(0).getBrand());
    }

    private static void initializeInventory (Inventory inventory) {
        inventory.addMobile(Mobile.builder().mobileNo(9440964913L).brand("Apple").network("Jio").price(999).simFree(true).build());
        inventory.addMobile(Mobile.builder().mobileNo(9491279678L).brand("Apple").network("Jio").price(999).simFree(true).build());
        inventory.addMobile(Mobile.builder().mobileNo(74405195886L).brand("Samsung").network("Sky").price(399).simFree(true).build());
        inventory.addMobile(Mobile.builder().mobileNo(7511577533L).brand("Apple").network("o2").price(999).simFree(true).build());
    }
}