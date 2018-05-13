import MenuCreator.*;
import MenuCreator.OutputGarageClosedReport;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Type;

public class MenuCreatorTests {
    //null checks for every class
    @Test
    public void testNullsAllMenus() {
        // Main M.
        Menu testMenu = MenuFactory.createMenu(MenuChoice.INPUT_MAIN_MENU);
        Assert.assertTrue(" main Menu failed null check",
                testMenu.getMenu() != null);
        //Submit M.
        testMenu = MenuFactory.createMenu(MenuChoice.INPUT_SUBMIT_PARKING_TICKET);
        Assert.assertTrue("submit tic." +
                "menu failed null check", testMenu != null);

        //Sp. Event M.
        testMenu = MenuFactory.createMenu(MenuChoice.OUTPUT_SPECIAL_EVENT_RECEIPT, 1,
                12.00);
        Assert.assertTrue("Special even menu failed null check." ,
                testMenu.getMenu() != null);

        //Lost T M.
        testMenu = MenuFactory.createMenu(MenuChoice.OUTPUT_LOST_TICKET_RECEIPT, 1,
                12.00);
        Assert.assertTrue("Lost ticket menu failed null check",
                testMenu.getMenu() != null);

        // Reg. Ticket M.
        testMenu = MenuFactory.createMenu(1, 1, "Test", 12.00);
        Assert.assertTrue("The regular ticket menu failed null check",
                testMenu.getMenu() != null);

        // Report M.
        double prices[] = {1, 2.0, 3.0};
        int ticketTypes[] = {1, 2, 3};

        testMenu = MenuFactory.createMenu(prices,  ticketTypes);
        Assert.assertTrue("The garage report failed null check",
                testMenu.getMenu() != null);
    }
}
