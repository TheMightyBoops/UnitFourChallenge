import MenuCreator.Menu;
import MenuCreator.MenuChoice;
import MenuCreator.MenuFactory;
import MenuCreator.OutputGarageClosedReport;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Type;

public class MenuFactoryTests {
    static Menu testMenu;

    @Test
    public void testMenuFactory() {
        testMenu = MenuFactory.createMenu(MenuChoice.INPUT_MAIN_MENU);
        Assert.assertTrue("Your menu is null somehow",testMenu!= null);
    }
}
