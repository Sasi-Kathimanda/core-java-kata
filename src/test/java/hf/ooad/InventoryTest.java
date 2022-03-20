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
        Mobile m1 = Mobile.builder()
                .mobileNo(9440964913L)
                .brand("Apple")
                .network("Jio")
                .price(999)
                .simFree(true)
                .build();

        inventory.addMobile(m1);
        assertEquals("Apple",inventory.getMobileList().get(0).getBrand());
    }
}